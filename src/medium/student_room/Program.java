package medium.student_room;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos serão alugados? ");
        int qtRoom = sc.nextInt();

        Rent[] vect = new Rent[10];

        for(int i = 0; i < qtRoom; i++) {
            System.out.println("\nRent #" + (i+1) + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("\nE-mail: ");
            String email = sc.next();

            System.out.print("\nQuarto desejado: ");
            int roomNumber = sc.nextInt();

            vect[roomNumber] = new Rent(name, email);
        }

        System.out.println("\nQuartos alugados:");

        for(int i = 0; i < vect.length; i++) {
            if(vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }
}
