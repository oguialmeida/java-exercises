// Celsius to fahrenheit conversion 
package Basic;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            boolean converterLoop = true;
            do {
                System.out.print("\033\143");
                System.out.print("Digite o valor que deseja converter: ");
                float value = sc.nextFloat();
                float convert = ((value * 9) / 5) + 32;

                System.out.printf("\nO valor convertido é de: %.2f F°", convert);
                System.out.print("\n\nDeseja continuar?[S/N] ");
                char answer = sc.next().charAt(0);

                if (answer == 's' || answer == 'S') {
                    converterLoop = true;
                } else if (answer == 'n' || answer == 'N') {
                    converterLoop = false;
                } else {
                    System.out.println("Comando inválido! Digite novamente");
                }
            } while (converterLoop == true);
            sc.close();
        } catch (Exception e) {
            System.out.println("Comando inválido! Programa encerrado");
        }
    }
}
