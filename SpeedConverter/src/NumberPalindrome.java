public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221)); // true
        System.out.println(isPalindrome(707)); // true
        System.out.println(isPalindrome(112212)); // false

    }

    public static boolean isPalindrome(int number) {
        int initial = number;
        int reverse = 0;

        while (number !=0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }
        return (reverse == initial);
    }
}
