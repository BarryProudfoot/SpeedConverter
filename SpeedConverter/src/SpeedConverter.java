public class SpeedConverter {

    public static void main(String[] args) {
        SpeedConverter.printConversion(1.5); // 1
        SpeedConverter.printConversion(10.25); // 6
        SpeedConverter.printConversion(-5.6); // -1
        SpeedConverter.printConversion(25.42); // 16
        SpeedConverter.printConversion(75.114); // 47
    }


    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour +
                    " km/h = " + milesPerHour +
                    " mi/h");
        }
    }
}
