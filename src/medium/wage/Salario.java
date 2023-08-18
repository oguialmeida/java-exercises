package medium.wage;

public class Salario {
    public String name;
    public double salary;
    public double tax;
    public double percentage;

    public double netSalary() {
        return salary - tax;
    }

    public void increaseSalary(double percentage) {
        double current = netSalary();
        this.salary = ((percentage / 100) * current) + current;
    }
}
