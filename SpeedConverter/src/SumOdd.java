public class SumOdd {

    public static void main(String[] args) {

        System.out.println(sumOdd(1, 100)); // 2500
        System.out.println(sumOdd(-1, 100)); // -1
        System.out.println(sumOdd(100, 100)); // 0
        System.out.println(sumOdd(13, 13)); // 13
        System.out.println(sumOdd(100, -100)); // -1
        System.out.println(sumOdd(100, 1000)); // 247500
    }

    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        } else if (number % 2 != 0) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if ((start <= end) && ((start > 0) && (end > 0))) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
        } else {
            return -1;
        }
        return sum;
    }
}
