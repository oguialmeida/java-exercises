package medium.boletim;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        Boletim boletim = new Boletim();

        System.out.printf("Digite o nome do aluno: ");
        boletim.name = sc.nextLine();

        System.out.println("Digite as 3 notas do aluno: ");
        for(int i = 0; i < 3; i++) {
            boletim.grades[i] = sc.nextDouble();
        }

        System.out.println("Nota final: " + df.format(boletim.sumGrades()) + "\n" + boletim.result());

        sc.close();
    }
}
