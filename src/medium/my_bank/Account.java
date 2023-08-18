package medium.my_bank;

public class Account {
    // Creating the private attributes
    private String holder;
    private int number;
    private double balance;

    // Creating the getters and setters
    public Account(String holder, int number) {
        this.holder = holder;
        this.number = number;
    }

    public Account(String holder, int number, double balance) {
        this.holder = holder;
        this.number = number;
        deposit(balance);
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    // Creating the necessary methods
    public double deposit(double amount) {
        return balance += amount;
    }

    public double withdraw(double amount) {
        return balance -= amount + 5.0;
    }

    public String toString() {
        return "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
    }
}
