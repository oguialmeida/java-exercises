// Creating a continuous operation
package Basic;

import java.util.Scanner;

public class RepeatedSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean result = true;
        float sum = 0;
        try {
            while (result == true) {
                System.out.print("Digite os números que deseja somar: ");
                float value = sc.nextFloat();

                sum = sum + value;

                System.out.println("O resultado da sum é " + sum);
                System.out.println("\n\nDeseja consinuar?[S/N] ");
                char option = sc.next().charAt(0);

                if (option == 'S' || option == 's') {
                    result = true;
                } else if (option == 'N' || option == 'n') {
                    System.out.println("Programa encerrado :)");
                    result = false;
                } else {
                    System.out.println("Comando incorreto, programa encerrado");
                    result = false;
                }
                System.out.print("\033\143");
            }
        } catch (Exception e) {
            System.out.println("Comando incorreto, programa encerrado!");
        }
        sc.close();
    }
}
