package medium.triang;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle x;
        x = new Triangle();

        for(int i = 0; i < 2; i++) {
            System.out.printf("Digite a base e altura do triangulo %d: \n", i + 1);
            x.a[i] = sc.nextDouble();
            x.b[i] = sc.nextDouble();

            x.result[i] = x.TriangArea(x.a[i], x.b[i]);

            System.out.printf("Área do triângulo %d: %.2f\n", i + 1, x.result[i]);
        }

        int triangleWithLargerArea = x.CompareTriang(x.result[0], x.result[1]);

        System.out.printf("A área do triângulo %d é maior\n", triangleWithLargerArea);
    }
}

