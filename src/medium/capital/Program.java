package medium.capital;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a cotação atual do dólar: ");
        double value = sc.nextDouble();

        System.out.println("Quantos dolares deseja comprar: ");
        double quant = sc.nextDouble();

        System.out.printf("Total em reais: %.2f", CurrencyConverter.finalPrice(value, quant));

        sc.close();
    }
}
