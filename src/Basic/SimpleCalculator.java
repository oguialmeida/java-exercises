// A simple calculator which takes two numbers
package Basic;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean makeLoop = true;

        try {
            while (makeLoop == true) {
                System.out.print("\033\143");
                System.out.println("|---------------------------------|");
                System.out.println("|-----------Calculadora-----------|");
                System.out.println("|---------------------------------|");

                System.out.print("Primeiro número: ");
                float num1 = sc.nextFloat();
                System.out.print("Segundo número: ");
                float num2 = sc.nextFloat();

                System.out.print("\033\143");

                System.out.println("|---------------------------------|");
                System.out.println("|-------------Escolha-------------|");
                System.out.println("|---------------------------------|");

                System.out.println(
                        "Digite o numero correpondente para: \n[1]Somar\n[2]Subtrair\n[3]Multiplicar\n[4]Dividir\n[5]Sair");
                int op = sc.nextInt();

                System.out.print("\033\143");

                switch (op) {
                    case 1:
                        System.out.println("A soma é: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("A subtração é: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("A mutiplicação é: " + (num1 * num2));
                        break;
                    case 4:
                        System.out.println("A divisão é: " + (num1 / num2));
                        break;
                    case 5:
                        makeLoop = false;
                    default:
                        System.out.println("Digite um valor válido!");
                }

                System.out.println("Deseja continuar?[S/N]");
                char resp = sc.next().charAt(0);

                if (resp == 'N' || resp == 'n') {
                    makeLoop = false;
                } else if (resp == 'S' || resp == 's') {
                    makeLoop = true;
                } else {
                    System.out.println("Comando incorreto! Programa encerrado :)");
                    makeLoop = false;
                }
            }
        } catch (Exception e) {
            System.out.println("Erro na entrada de dados, tente novamente :(");
        }
        ;
        sc.close();
    }
}
