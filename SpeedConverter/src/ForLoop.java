public class ForLoop {

    public static void main(String[] args) {

//        double amount = 10000.0;
//        for (int i=8; i>1; i--){
//            System.out.println("amount of " + amount + " returns " + String.format("%.2f",calculateInterest(amount, i)) + " at " + i + "%");
        int found =0;
        for (int j=2; j<100; j++){
            if (isPrime(j)) {
                found ++;
                System.out.println("Prime number found of " + j);
                if (found >= 30) {
                    break;
                }
            }
        }
    }

    public static double calculateInterest (double amount, double interestRate){
        return (amount * (interestRate/100));
    }


    public static boolean isPrime (int n){
        if (n ==1){
            return false;
        }
        for (int i=2; i <=n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}
