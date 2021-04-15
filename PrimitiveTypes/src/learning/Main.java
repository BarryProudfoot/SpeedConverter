package learning;

public class Main {

    public static void main(String[] args) {

        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;
        long myLong = 50000 + (10 * (myByte + myShort + myInt));
        System.out.println(myLong);

        int myIntValue =5;
        float myFloatValue = (float) 5; //Cast float to enusre it doesnt use Double by default
//        float myFloatValue = 5.25f; //Alternative to casting
        double myDoubleValue = 5;
        System.out.println("My Int value " + myIntValue /3);
        System.out.println("My Float value " + myFloatValue /3);
        System.out.println("My Double value " + myDoubleValue /3 +"\n");


        double poundsToConvert = 200;
        double conversionFactor = 0.45359237;
        double kilogramResult = poundsToConvert * conversionFactor;
        System.out.println("Kilograms = " + kilogramResult);

        //Strings are not primitive types, they are classes in fact

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2021";
        System.out.println("myString is equal to " + myString);
    }
}
