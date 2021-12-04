package academy.learnprogramming;
import java.util.Scanner;

public class SortedArray {
    public static int[] getIntegers(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Four numbers for your array");
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortIntegers(int[] array) {
        boolean isDone = false;

        while (!isDone) {
            isDone = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] < array[i]) {
                    isDone = false;
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
            }
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}
