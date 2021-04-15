public class LeapYear {

    public static void main(String[] args) {
        System.out.println(LeapYear.isLeapYear(-1600)); //false
        System.out.println(LeapYear.isLeapYear(1600)); //true
        System.out.println(LeapYear.isLeapYear(2017)); //false
        System.out.println(LeapYear.isLeapYear(2000)); //true
        System.out.println(LeapYear.isLeapYear(101000)); //false
        System.out.println(LeapYear.isLeapYear(1800)); //false
    }

    public static boolean isLeapYear(int year) {
        return year >= 0 && year <= 9999 && year % 4 == 0 && year % 100 == 0 && year % 400 == 0;
    }
}
