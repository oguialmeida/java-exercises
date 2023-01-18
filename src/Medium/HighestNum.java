// Shows the highest between three numbers
package Medium;

import java.util.Scanner;

public class HighestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int higher = max(num1, num2, num3);

        showResult(higher);

        sc.close();
    }
    public static int max(int num1, int num2, int num3) {
        int aux;
        if(num1 > num2 && num1 > num3) {
            aux = num1;
        } else if (num2 > num3) {
            aux = num2;
        } else {
            aux = num3;
        }
        return aux;
    } 
    public static void showResult(int value) {
        System.out.println("Valor mais alto: "+ value);
    }
}
