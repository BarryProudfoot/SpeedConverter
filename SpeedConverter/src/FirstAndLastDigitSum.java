public class FirstAndLastDigitSum {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252)); // 4
//        System.out.println(sumFirstAndLastDigit(257)); // 9
//        System.out.println(sumFirstAndLastDigit(0)); // 0
//        System.out.println(sumFirstAndLastDigit(5)); // 10
//        System.out.println(sumFirstAndLastDigit(-10)); // -1
    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }
            int num = number;
            int lastDigit = num % 10;
               while (num>9) {
                   num = num/10;
            }
        return lastDigit + num;
    }
}
