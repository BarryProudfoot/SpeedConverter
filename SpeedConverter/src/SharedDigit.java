public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23)); // true
        System.out.println(hasSharedDigit(9,99)); // false
        System.out.println(hasSharedDigit(15,55)); // true
        System.out.println(hasSharedDigit(19,99)); // true
        System.out.println(hasSharedDigit(12,13)); // true
        System.out.println(hasSharedDigit(1255,15)); // true
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10 || num1 > 10000) || (num2 < 10 || num2 > 10000)) {
            return false;
        }
        int initialNum2 = num2;
        int number1 = num1;
        int number2 = num2;

        while (num1 > 0) {
            number1 = num1 % 10;
            num1 = num1 / 10;
            while (num2 > 0){
                number2 = num2 % 10;
                if (number1 == number2){
                    return true;
                }
                num2 = num2 / 10;
            }
            num2 = initialNum2;
        }
        return false;
    }
}
