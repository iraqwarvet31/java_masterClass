public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hoursOfDay) {
        if (barking) {
            if ((hoursOfDay < 8 && hoursOfDay >= 0) || (hoursOfDay == 23)) {
                return true;
            } else if (hoursOfDay < 0 || hoursOfDay > 23) {
                return false;

            }
            return false;
        }
        return false;
    }
}
