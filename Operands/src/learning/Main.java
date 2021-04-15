package learning;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3 (1 and 2 are operands, + is the operator
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("2 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        //result = result +1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //result = result +2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        //result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        //result = result / 3;
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        //result = result -2;
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
//        if (isAlien == false)
        if (!isAlien) {
            System.out.println("It is not an alien!");
            System.out.println("I am scared of aliens");
        }

        int topScore = 80;
        if (topScore == 100 ){ // can you >, 1=, >=, <=
            System.out.println("You got the high score");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)){ // 'logical And' both conditions need to be true
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of conditions are true"); // 'logical Or' either conditions can be true
        }

        boolean isCar = false;
        if (!isCar){
            System.out.println("Correct, it is not a car");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        System.out.println(wasCar);

        //Operator Challenge

        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double firstCalc = (firstDouble + secondDouble) * 100.00d;
        System.out.println("First calc = " + firstCalc);
        double secondCalc = firstCalc % 40.00d;
        System.out.println("Second Calc " + secondCalc);
        boolean isEmpty = (secondCalc ==0) ? true : false;
        System.out.println("isEmpty = " + isEmpty);
        if (!isEmpty){
            System.out.println("You got some remainder");
        }
    }
}
