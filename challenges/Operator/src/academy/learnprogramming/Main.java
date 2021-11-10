package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    double doubleValue1 = 20.00;
        double doubleValue2 = 80.00;
        double doublesAdded = (doubleValue1 + doubleValue2) * 100;

        double doubleRemainder = doublesAdded % 40.00;

        boolean isResultZero = doubleRemainder == 0;
        System.out.println("isResultZero = " + isResultZero);

        if (!isResultZero)  {
            System.out.println("Got some remainder");
        }
    }
}
