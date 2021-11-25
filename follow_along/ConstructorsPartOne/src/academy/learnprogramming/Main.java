package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        BankAccount larrys = new BankAccount(
//                4444322221L,
//                100.00,
//                "Larry",
//                "IraqwarVet31@gmail.com",
//                6612257267L
//                );
//
//        larrys.print();
//
//        BankAccount waldos = new BankAccount();
//        waldos.print();
        VipCustomer joe = new VipCustomer("Joe", "1000000", "joe@gmail.com");
        joe.print();

        VipCustomer shelly = new VipCustomer("Shelly", "shelJJ@msn.com");
        shelly.print();

        VipCustomer rick = new VipCustomer();
        rick.print();

    }
}
