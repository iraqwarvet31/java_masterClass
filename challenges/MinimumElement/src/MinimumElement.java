import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        int number = readInteger();
        int[] userElements = readElements(number);
        findMin(userElements);
    }
    private static int readInteger() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many elements do you want to input?");
        return userInput.nextInt();
    }
    private static int[] readElements(int number) {
        Scanner userInput = new Scanner(System.in);
        int[] userNumbers = new int[number];
        System.out.println("Enter " + number + " numbers");

        for (int i = 0; i < userNumbers.length; i++) {
            userNumbers[i] = userInput.nextInt();
        }
        System.out.println("Your array: " + Arrays.toString(userNumbers));
        return userNumbers;
    }
    private static int findMin(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i += 1) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("minimum number: " + min);
        return min;
    }
}

/*
min = 10
[10, 5, 16]

 */