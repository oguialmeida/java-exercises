// Learning to use concatenation
package Basic;

import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantos centimetros deseja converter: ");

        float metros = sc.nextFloat() / 100;
        
        System.out.println("Resultado = "+ metros + " Metros");

        System.out.printf("Resultado = %.2f Metros", metros );
        
        sc.close();
    }
}
