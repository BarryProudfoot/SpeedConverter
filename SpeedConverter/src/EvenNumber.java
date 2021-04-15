public class EvenNumber {

    public static void main(String[] args) {
        System.out.println(isEvenNumber(100)); //True
        System.out.println(isEvenNumber(7)); //False
        System.out.println(isEvenNumber(-1)); //False


        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            count++;
            System.out.println("Even number " + number);
            if (count >= 5) {
                System.out.println("Total numbers found " + count);
            break;
            }
        }
    }

    public static boolean isEvenNumber (int number){
        return ((number % 2) ==0);
    }
}
