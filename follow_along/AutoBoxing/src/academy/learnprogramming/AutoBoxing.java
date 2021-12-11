package academy.learnprogramming;

import java.util.ArrayList;

public class AutoBoxing {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(40);
        numbers.add(20);
        numbers.add(100);

        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}
