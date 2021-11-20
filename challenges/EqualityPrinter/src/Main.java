public class Main {
    public static void main(String[] args) {
        EqualityPrinter.printEqual(1, 1, 1); // all equal
        EqualityPrinter.printEqual(1, 1, 2); // Neither all  equal or different
        EqualityPrinter.printEqual(-1, -1, -1); // Invalid Value
        EqualityPrinter.printEqual(1, 2, 3);
        EqualityPrinter.printEqual(2, 1, 1); // Neither all equal or different
        EqualityPrinter.printEqual(1, 2, 1);
    }
}
