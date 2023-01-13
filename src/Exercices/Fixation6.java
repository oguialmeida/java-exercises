package Exercices;

import java.util.Scanner;

public class Fixation6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            for (boolean resp = true; resp != false;) {
                System.out.print("\033\143");
                System.out.print("Digite quantos números deseja somar: ");
                float num = sc.nextFloat();
                float result = 0;
                for (int i = 0; i < num; i++) {
                    System.out.print("Digite os números: ");
                    float numbers = sc.nextFloat();

                    result += numbers;
                }
                System.out.println("A soma é de: " + result);

                System.out.println("Deseja somar novamente?[S/N] ");
                char option = sc.next().charAt(0);
                if (option == 'S' || option == 's') {
                    resp = true;
                } else if (option == 'N' || option == 'n') {
                    System.out.println("Programa encerrado com sucesso! :)");
                    resp = false;
                } else {
                    System.out.println("Entrada de dados incorreta, programa encerrado!");
                    resp = false;
                }
            }
        } catch (Exception e) {
            System.out.println("Entrada de dados incorreta, programa encerrado!");
        }
        sc.close();
    }
}
