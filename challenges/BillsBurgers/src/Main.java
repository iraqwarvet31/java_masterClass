class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(name + " hamburger on a " + breadRollType +
                " roll with " + meat + ", price is " + price);
    }
    public void addHamburgerAddition1(String ingredient, double price) {
        this.addition1Name = ingredient;
        this.addition1Price = price;
        System.out.println("Added " + ingredient + " for an extra " + price);
    }
    public void addHamburgerAddition2(String ingredient, double price) {
        this.addition2Name = ingredient;
        this.addition2Price = price;
        System.out.println("Added " + ingredient + " for an extra " + price);
    }
    public void addHamburgerAddition3(String ingredient, double price) {
        this.addition3Name = ingredient;
        this.addition3Price = price;
        System.out.println("Added " + ingredient + " for an extra " + price);
    }
    public void addHamburgerAddition4(String ingredient, double price) {
        this.addition4Name = ingredient;
        this.addition4Price = price;
        System.out.println("Added " + ingredient + " for an extra " + price);
    }
    public double itemizeHamburger() {
        return this.price + this.addition1Price + this.addition2Price +
                this.addition3Price + this.addition4Price;
    }
}

class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition1("chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String ingredient, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String ingredient, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String ingredient, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String ingredient, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }
}

class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double healthyPrice) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = healthyPrice;
        System.out.println("Added " + name + " for an extra " + healthyPrice);
    }
    public void addHealthyAddition2(String name, double healthyPrice) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = healthyPrice;
        System.out.println("Added " + name + " for an extra " + healthyPrice);
    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger() + this.healthyExtra1Price + this.healthyExtra2Price;
    }
}

public class Main {
    public static void main(String[] args) {
//        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
//        hamburger.addHamburgerAddition1("Tomato", 0.27);
//        hamburger.addHamburgerAddition2("Lettuce", 0.75);
//        hamburger.addHamburgerAddition3("Cheese", 1.13);
//        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

//        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
//        healthyBurger.addHamburgerAddition1("Egg", 5.43);
//        healthyBurger.addHealthyAddition1("Lentils", 3.41);
//        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + String.format("%.2f", db.itemizeHamburger()));
    }
}
