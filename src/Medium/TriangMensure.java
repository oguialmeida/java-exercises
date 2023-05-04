package Medium;
import java.util.Scanner;

public class TriangMensure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] height = new double[2];
        double[] base = new double[2];
        double[] result = new double[2];;

        for (int i = 0; i < 2; i++) {
            System.out.printf("Digite a base do triângulo " + (i + 1) + ": ");
            base[i] = sc.nextDouble();

            System.out.printf("Digite a altura do triângulo " + (i + 1) + ": ");
            height[i] = sc.nextDouble();
        }

        for (int i = 0; i < 2; i++) {
            result[i] = (height[i] * base[i])/2;
            System.out.println(" Área do triângulo " + (i + 1) + ": " + result[i]);
        }

        if (result[0] > result[1]) {
            System.out.println("A área do trinângulo 1 é maior");
        } else {
            System.out.println("A área do trinângulo 2 é maior");
        }

        sc.close();
    }
}

