// The sum of two numbers
package basic;

import java.util.Locale;

public class Sum {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = a + b;
        // Mostrando valor acrescentado
        System.out.println(c);

        double x = 10.8789;

        // Limitando casa decimais com quebra de linha
        // O printf é especifico para apresnetar variáveis
        System.out.printf("%.2f\n", x);

        Locale.setDefault(Locale.US);
    }
}