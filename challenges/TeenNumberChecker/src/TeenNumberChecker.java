public class TeenNumberChecker {

    public static boolean hasTeen(int one, int two, int three) {
        return isTeen(one) || isTeen(two) || isTeen(three);
    }

    public static boolean isTeen(int one) {
        return one >= 13 && one <= 19;
    }
}
