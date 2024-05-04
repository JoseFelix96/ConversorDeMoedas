package br.com.alura.conversordemoedas.main;

import br.com.alura.conversordemoedas.model.RequestCurrency;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        String menu = """
                ******************************************************
                Bem-vindo(a) ao Conversor de moedas.
                                
                Abaixo você deve informar a sigla da moeda que você
                  deseja converter e para qual moeda deseja converter,
                  respectivamente.
                 
                USD - Dolar Americano     EUR - Euro
                BRL - Real Brasileiro     CAD - Dolar Canadense
                GBP - Libra Esterlina     JPY - Iene Japonês
                CHF - Franco Suiço        CLP - Peso Chileno
                ARS - Peso Argentino      COP - Peso Comlobiano
                
                                
                Ou, sinta-se livre para tentar com qualquer outra
                  moeda.
                ******************************************************
                """;

        Scanner scanner = new Scanner(System.in);
        System.out.println(menu);
        System.out.println("Informe a moeda que você quer converter: ");
        String actualCurrenty = scanner.nextLine().toUpperCase(Locale.ROOT);
        System.out.println("Para qual moeda você deseja converter? ");
        String toConvertCurrency = scanner.nextLine().toUpperCase(Locale.ROOT);
        System.out.println("Informe o valor que deseja converter: ");
        double value = scanner.nextDouble();

        RequestCurrency request = new RequestCurrency();

        request.getCurrency(actualCurrenty, toConvertCurrency, value);
    }
}
