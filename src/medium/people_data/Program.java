package medium.people_data;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite a quantidade de pessoas: ");
            int quant = sc.nextInt();

            String[] names = new String[quant];
            int[] ages = new int[quant];
            double[] heights = new double[quant];
            double htAvrg = 0.0;
            int ctAge = 0;
            String[] auxNames = new String[quant];

            for(int i = 0; i < quant; i++) {
                System.out.println("Dados da "+ (i + 1) +" pessoa:");
                System.out.print("Nome: ");
                names[i] = sc.next();

                System.out.print("Idade: ");
                ages[i] = sc.nextInt();

                System.out.print("Altura: ");
                heights[i] = sc.nextDouble();

                if(ages[i] <= 16) {
                    ctAge++;
                    auxNames[i] = names[i];
                }
            }

            for(int i = 0; i < quant; i++) {
                htAvrg = heights[i] + htAvrg;
            }

            System.out.println("A média das alturas é: " + htAvrg/quant + "m");
            System.out.println("A quantidade de pessoas com menos de 16 anos é: " + (ctAge * 100.0) / quant + "%");

            for(int i = 0; i < ctAge; i++) {
                System.out.println(auxNames[i]);
            }
        } catch (Exception e) {
            System.out.println("Erro na entrada de dados, tente novamente :(");
        }

        sc.close();
    }
}
