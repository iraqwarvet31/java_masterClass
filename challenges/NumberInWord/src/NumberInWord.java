public class NumberInWord {
    public static void printNumberInWord(int number) {
        String answer;

        switch (number) {
            case 0:
                answer = "ZERO";
                break;
            case 1:
                answer = "ONE";
                break;
            case 2:
                answer = "TWO";
                break;
            case 3:
                answer = "THREE";
                break;
            case 4:
                answer = "FOUR";
                break;
            case 5:
                answer = "FIVE";
                break;
            case 6:
                answer = "SIX";
                break;
            case 7:
                answer = "SEVEN";
                break;
            case 8:
                answer = "EIGHT";
                break;
            case 9:
                answer = "NINE";
                break;
            default:
                answer = "OTHER";
                break;
        }
        System.out.println(answer);
    }
}
