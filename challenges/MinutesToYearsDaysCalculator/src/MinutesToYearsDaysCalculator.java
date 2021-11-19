public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }

        int hours = (int) Math.round((double) minutes / 60);
        System.out.println(hours);
        int days = (int) Math.round((double) hours / 24);
        int years = (int) Math.round((double) days / 365);

        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}
