// Calculating the area of a trapezoid
package basic;

import java.util.Scanner;

public class TrapazeArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da base: ");
        double bigBase = sc.nextDouble();

        System.out.print("Digite o tamanho da base menor: ");
        double smallBase = sc.nextDouble();

        System.out.print("Digite a altura do trapézio: ");
        double height = sc.nextDouble();

        double area = (bigBase + smallBase) / height * 2.0;

        System.out.printf("\nA altura do trapézio é %.4f\n", area);

        sc.close();
    }
}
