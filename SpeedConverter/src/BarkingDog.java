public class BarkingDog {

    public static void main(String[] args) {
        BarkingDog.shouldWakeUp(true, 1); //true
        BarkingDog.shouldWakeUp(false, 2); //false
        BarkingDog.shouldWakeUp(true, 8); //false
        BarkingDog.shouldWakeUp(true, -1); //false
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay >= 8 && hourOfDay <= 22 || hourOfDay < 0 || hourOfDay > 23 || !barking){
            System.out.println(barking +" at " + hourOfDay + " so false");
            return false;
        }
        System.out.println(barking +" at " + hourOfDay + " so true");
        return true;
    }
}
