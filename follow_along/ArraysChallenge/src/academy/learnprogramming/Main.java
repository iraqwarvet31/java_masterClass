package academy.learnprogramming;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int[] integers = SortedArray.getIntegers(4);
        SortedArray.sortIntegers(integers);
        SortedArray.printArray(integers);
    }
}

/*
[40, 20, 36, 10]
 i-1  i
 */