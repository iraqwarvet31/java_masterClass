public class MegaBytes {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int mbs = (int) Math.floor((double) kiloBytes / 1024);
            int remainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + mbs + " MB" +
                    " and " + remainder + " KB");
        }
    }
}
