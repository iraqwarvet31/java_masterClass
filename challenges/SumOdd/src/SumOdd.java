public class SumOdd {
    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }

        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if (start > end || start < 0 || end < 0) {
            System.out.println(-1);
            return -1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        System.out.println("The sum of all numbers is = " + sum);
        return sum;
    }
}
