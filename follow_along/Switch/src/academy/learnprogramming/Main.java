package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//	    int switchValue = 3;
//
//        switch (switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("Was a 3, or a 4, or a 5");
//                System.out.println("Was actually " + switchValue);
//                break;
//            default:
//                System.out.println("Was no 1, 2, 3, 4, or 5");
//                break;
//        }

        char myChar = 'F';

        switch (myChar) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("We found " + myChar + "!");
                break;
            default:
                System.out.println("Not found");
        }
    }
}
