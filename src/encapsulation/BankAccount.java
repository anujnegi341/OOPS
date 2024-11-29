package encapsulation;

public class BankAccount {
    private String owner;
    private double balance;

    BankAccount(String name, double initialAmount) {
        owner = name;
        balance = initialAmount;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if(amount > balance) {
            throw new IllegalArgumentException("Amount cannot be greater than balance");
        }
        balance -= amount;
    }
}
