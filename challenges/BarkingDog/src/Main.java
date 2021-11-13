@SuppressWarnings("ALL")
public class Main {

    public static void main(String[] args) {
        boolean handleLelandBarking = BarkingDog.shouldWakeUp(true, 1);
        System.out.println(handleLelandBarking);

        boolean handleBettyBarking = BarkingDog.shouldWakeUp(false, 2);
        System.out.println(handleBettyBarking);

        boolean handleFitoBarking = BarkingDog.shouldWakeUp(true, 8);
        System.out.println(handleFitoBarking);

        boolean handleAshBarking = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(handleAshBarking);
    }
}
