package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    // forward loop
        for (int i = 2; i <= 8; i++) {
            double interest = calculateInterest(10000.0, i);
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", interest));
        }
        // backward loop
        for (int i = 8; i >= 2; i--) {
            double interest = calculateInterest(10000.0, i);
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", interest));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) return false;

        for (int i=2; i <= n/2; i++) {
            return false;
        }

        return true;
    }
}
