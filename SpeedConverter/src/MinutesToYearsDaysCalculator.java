public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);
    }

    public static void printYearsAndDays (long minutes){
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long secondsInYear = (365 * 24 * 60);
            long minsInDay = (60 * 24);
            long years = minutes / secondsInYear;
            long remainingDays = minutes % secondsInYear / minsInDay;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }
}