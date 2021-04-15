package learning;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int levelCompleted = 5;
        int bonus = 100;
        int score = 5000;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        levelCompleted = 8;
        bonus = 200;
        score = 10000;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition();
    }

    public static void displayHighScorePosition() {

        int playerOneScore = 1500;
        int playerTwoScore = 900;
        int playerThreeScore = 400;
        int playerFourScore = 50;

        int position = calculateHighScorePosition(playerOneScore);
        System.out.println("Player 1 managed to achieve a position of " + position + " on the high score table");

        position = calculateHighScorePosition(playerTwoScore);
        System.out.println("Player 2 managed to achieve a position of " + position + " on the high score table");

        position = calculateHighScorePosition(playerThreeScore);
        System.out.println("Player 3 managed to achieve a position of " + position + " on the high score table");

        position = calculateHighScorePosition(playerFourScore);
        System.out.println("Player 4 managed to achieve a position of " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {

//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//        return 4;

        int position =4; // assuming position 4 will be returned - smarter coding to above example
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >=100) {
            position = 3;
        }
        return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }
}