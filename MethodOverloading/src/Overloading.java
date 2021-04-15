public class Overloading {

    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(5,4);
        calcFeetAndInchesToCentimeters(126);

    }


    public static double calcFeetAndInchesToCentimeters (double feet, double inches){

        if ( (feet >=0) && (inches >=0 && inches <=12) ){
            System.out.println(feet + " feet, " + inches + " inches = " + ((feet * 12 * 2.54) + (inches * 2.54)) + " cm" );
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters (double inches){

        if ( inches >=0.0 ){
            System.out.println(inches + " inches = " + (inches * 2.54) + " cm" );
        }
        return -1;
    }

}
