import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {4, 3, 2, 1};
        reverse(numbers);
    }
    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int i = 0;
        int j = array.length - 1;

        while (i <= j) {
            int temp;
            temp = array[i];
            array[i] = array[j];
            array[j]= temp;
            i++;
            j--;
        }

        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}

/*
[1, 2, 3, 4]
    i  j
[4, 2, 3, 1]
[4, 3, 2, 1]
 */