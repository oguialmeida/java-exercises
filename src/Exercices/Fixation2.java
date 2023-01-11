// How to use the ternary operator

package Exercices;

import java.util.Scanner;

public class Fixation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o preço do produto desejado: ");
        double price = sc.nextDouble();

        double discount = (price < 20.0) ? price * 0.1 : price * 0.05;
        System.out.println("Valor do desconto: " + discount);

        sc.close();
    }
}
