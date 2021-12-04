package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	    int[] myIntegers = getIntegers(5);
        System.out.println("Your array: " + Arrays.toString(myIntegers));

        System.out.println("Getting average.....");
        System.out.println("Average of elements is: " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / (double) array.length - 1;
    }
}
