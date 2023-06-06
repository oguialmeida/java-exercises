package Medium;

import java.util.Scanner;

public class TriangMensure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] height = new double[2];
        double[] base = new double[2];
        double[] result = new double[2];

        for (int i = 0; i < 2; i++) {
            System.out.printf("Digite a base do triângulo %d: ", i + 1);
            base[i] = sc.nextDouble();

            System.out.printf("Digite a altura do triângulo %d: ", i + 1);
            height[i] = sc.nextDouble();

            result[i] = (height[i] * base[i]) / 2;
            System.out.printf("Área do triângulo %d: %.2f\n", i + 1, result[i]);
        }

        int triangleWithLargerArea = (result[0] > result[1]) ? 1 : 2;
        System.out.printf("A área do triângulo %d é maior\n", triangleWithLargerArea);

        sc.close();
    }
}
