// Compare two numbers in binary terms
package Medium;

import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean compars = true;
        int numOper;
        String binOper;
        try {
            while (compars != false) {
                System.out.print("\033\143");

                System.out.print("Digite o primeiro número: ");
                int num1 = sc.nextInt();

                System.out.print("Digite o segundo número: ");
                int num2 = sc.nextInt();

                System.out.print("\033\143");

                System.out.println("Digite: \n[1] Para usar '&'\n[2] Para usar '|'\n[3] Para usar '^'\n");
                int option = sc.nextInt();

                switch (option) {
                    case 1:
                        numOper = num1 & num2;
                        binOper = Integer.toBinaryString(numOper);
                        System.out.println("Comparação '&':\n Númerico: " + numOper + "\n Binário: " + binOper);
                        break;
                    case 2:
                        numOper = num1 | num2;
                        binOper = Integer.toBinaryString(numOper);
                        System.out.println("Comparação '|':\n Númerico: " + numOper + "\n Binário: " + binOper);
                        break;
                    case 3:
                        numOper = num1 ^ num2;
                        binOper = Integer.toBinaryString(numOper);
                        System.out.println("Comparação '^':\n Númerico: " + numOper + "\n Binário: " + binOper);
                        break;
                    default:
                        System.out.println("Valor inválido");
                }
                System.out.print("\nDeseja continuar?[S/N] ");
                char resp = sc.next().charAt(0);

                if (resp == 'S' || resp == 's') {
                    compars = true;
                } else if (resp == 'n' || resp == 'N') {
                    compars = false;
                } else {
                    System.out.println("Valor inválido! programa encerrado\n");
                    compars = false;
                }
            }
        } catch (Exception e) {
            System.out.println("Entrada de dados inválida!");
        }
        sc.close();
    }
}
