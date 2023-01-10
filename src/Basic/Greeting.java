package Basic;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas hours são?");
        int hours = sc.nextInt();

        if (hours >= 6 && hours <= 12) {
            System.out.println("Bom dia");
        }

        else if (hours > 12 && hours < 18) {
            System.out.println("Boa tarde");
        }
        
        else if (hours > 18 && hours <= 23) {
            System.out.println("Boa noite");
        }
        else {
            System.out.println("Xô, vai dormir!");
        }
        sc.close();
    }
}
