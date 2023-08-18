package medium.wage;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.000");
        Salario salario = new Salario();

        System.out.println("Nome: ");
        salario.name = sc.nextLine();

        System.out.println("Salário bruto: ");
        salario.salary = sc.nextDouble();

        System.out.println("Desconto: ");
        salario.tax = sc.nextDouble();

        System.out.printf("Funcionário %s,  salário: R$ %s\n", salario.name, df.format(salario.netSalary()));

        System.out.println("Digite uma porcentagem para aumentar o salário: ");
        salario.percentage = sc.nextDouble();

        salario.increaseSalary(salario.percentage);

        System.out.printf("Salário atualizado: R$ %s", df.format(salario.salary));

        sc.close();
    }
}
