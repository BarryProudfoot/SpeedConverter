public class PlayingCat {

    public static void main(String[] args) {
        System.out.println(PlayingCat.isCatPlaying(true, 10));
        System.out.println(PlayingCat.isCatPlaying(false, 36));
        System.out.println(PlayingCat.isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if ((summer) && (temperature >= 25 && temperature <= 45)) {
            return true;
        } else return (!summer) && (temperature >= 25 && temperature <= 35);
    }
}