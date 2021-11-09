package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // Integers min and max storage
	    int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Min value = " + myMinIntValue);
        System.out.println("Integer Max value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        // Can use underscores for readability 2,147,483,647;
        int myMaxIntTest = 2_147_483_647;
        System.out.println("maxIntTest = " + myMaxIntTest);

        // Bytes
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min value = " + myMinByteValue);
        System.out.println("Byte Max value = " + myMaxByteValue);

        // Short
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min value = " + myMinShortValue);
        System.out.println("Short Max value = " + myMaxShortValue);
        
        // Long
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min value = " + myMinLongValue);
        System.out.println("Long Max value = " + myMaxLongValue);

        // Use L on end of a very large number
        long bigLongValue = 2147483647234L;

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        // receive an error below because your using an Int val:
        // byte myNewByteValue = (myMinByteValue / 2);

        // use casting like this:
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);

        // EXERCISES:
        byte myByteValue = 100;
        short myShortValue = 30000;
        int myIntValue = 3_834_264;
        long myLongValue = 50_000 + 10 * (myByteValue + myShortValue + myIntValue);
        System.out.println("Added values = " + myLongValue);

        /*
        A BYTE occupies 8 bits.
        A SHORT can store a large range of nums and occupies 16 bits
        An INT has a much larger range and occupies 32 bits
        A LONG has an even larger range and occupies 64 bits
         */

    }
}
