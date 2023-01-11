package Basic;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número do dia correspondente: ");
        int x = sc.nextInt();
        String weekDay;

        switch (x) {
            case 1:
                weekDay = "Domingo";
                break;
            case 2:
                weekDay = "Segunda";
                break;
            case 3:
                weekDay = "Terça";
                break;
            case 4:
                weekDay = "Quarta";
                break;
            case 5:
                weekDay = "Quinta";
                break;
            case 6:
                weekDay = "Sexta";
                break;
            case 7:
                weekDay = "Sábado";
                break;
            default:
                weekDay = "Válor inválido!";
        }
        System.out.println(weekDay);
        sc.close();
    }
}
