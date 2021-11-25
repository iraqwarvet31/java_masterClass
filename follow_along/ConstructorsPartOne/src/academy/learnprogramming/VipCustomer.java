package academy.learnprogramming;

public class VipCustomer {
    private String name;
    private String creditLimit;
    private String email;

    public VipCustomer() {
        this("Default name", "Default credit limit", "Default email");
        System.out.println("EMPTY CONSTRUCTOR!");
    }
    public VipCustomer(String name, String email) {
        this(name, "200.00", email);
    }
    public VipCustomer(String name, String creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    public void print() {
        System.out.println("VIP Customer: " + this.name);
        System.out.println("Credit limit: " + this.creditLimit);
        System.out.println("Email: " + this.email);
    }
}
