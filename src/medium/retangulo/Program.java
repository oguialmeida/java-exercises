package medium.retangulo;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Locale;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.000");

        Retangulo retangulo = new Retangulo();

        System.out.println("Digite os valores da base e da altura: ");
        retangulo.width = sc.nextDouble();
        retangulo.height = sc.nextDouble();

        System.out.println("Área: " + retangulo.totalArea());
        System.out.println("Perímetro: " + retangulo.totalPerimetro());
        System.out.println("Diagonal (arredondada): " + df.format(retangulo.totalDiagonal()));

        sc.close();
    }
}
