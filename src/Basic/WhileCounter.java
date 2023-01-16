// Simple counter
package Basic;

import java.util.Scanner;

public class WhileCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite até quando deseja contar: ");
        int number = sc.nextInt();
        int i = 0;

        while (i <= number) {
            i++;
            System.out.println(i);
        }

        sc.close();
    }
}
