package academy.learnprogramming;

public class BankAccount {
    private long account;
    private double balance;
    private String name;
    private String email;
    private Long phone;

    // Default values if nothing is passed to constructor
    public BankAccount() {
        this(111111, 0.0, "Default name", "Default address", 11111111L);
        System.out.println("Empty constructor called!");
    }
    public BankAccount(long account, double balance, String name, String email, Long phone) {
        this.account = account;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
    public void withdrawal(double amount) {
        double transaction = this.balance - amount;
        if (transaction - amount < 0) {
            System.out.println("Your new balance is: 0");
            this.balance = 0;
        } else {
            System.out.println("Your new balance is: " + transaction);
            this.balance = transaction;
        }
    }
    public void print() {
        System.out.println("Account number: " + this.account);
        System.out.println("Balance: " + this.balance);
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Phone number: " + this.phone);
    }
}