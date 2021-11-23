import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while(true) {
            if (!input.hasNextInt()) {
                break;
            }
            sum += input.nextInt();
            count += 1;
            input.nextLine();
        }
        long avg = count == 0 ? 0 : Math.round((double) sum / count);
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
