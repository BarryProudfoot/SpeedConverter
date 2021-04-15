public class DigitSumChallenge {

    public static void main(String[] args) {

        System.out.println(sumDigits(125)); // 8
        System.out.println(sumDigits(9)); // -1
        System.out.println(sumDigits(-9)); // -1
        System.out.println(sumDigits(123456789)); // 45

    }

    public static int sumDigits(int number){
        if (number <10) {
            return -1;
        } else {
            int sum =0;
            while (number > 0){
                int digit = number % 10; // 5
                sum += digit;
                number = number / 10; // 12
            }
            return sum;
        }
    }


}
