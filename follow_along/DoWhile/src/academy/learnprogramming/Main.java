package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        int count = 1;
//        while(count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }

        int count = 6;
        int i = 0;

        do {
            i = i + 1;
            count += i;
        } while (i < 6);

        System.out.println("Count value is " + count);
    }
}
