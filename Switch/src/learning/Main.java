package learning;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int switchValue = 6;

//        switch(switchValue){
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3:case 4:case 5:
//                System.out.println("Value was 3, 4 or 5");
//                break;
//            default:
//                System.out.println("Was not 1,2,3,4 or 5");
//                break;
//        }

        char myLetter = 'F';

        switch(myLetter) {
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C':
                System.out.println("Value was C");
                break;
            case 'D':
                System.out.println("Value was D");
                break;
            case 'E':
                System.out.println("Value was E");
                break;
            default:
                System.out.println("Value was not A,B,C,D or E");
                break;
        }

        String month = "January";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("January found");
                break;
            case "february":
                System.out.println("February found");
                break;
            default:
                System.out.println("Could not find");
                break;
        }

    }
}
