package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // Walk-through code
	    boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore;
        finalScore = calculateFinalScore(gameOver, score, levelCompleted, bonus);
        System.out.println(finalScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = calculateFinalScore(gameOver, score, levelCompleted, bonus);
        System.out.println(finalScore);


        // Challenge exercise
        int position = calculateHighScorePosition(1500);
        System.out.println(displayHighScorePosition("Larry", position));

        position = calculateHighScorePosition(900);
        System.out.println(displayHighScorePosition("Araceli", position));

        position = calculateHighScorePosition(400);
        System.out.println(displayHighScorePosition("James", position));

        position = calculateHighScorePosition(40);
        System.out.println(displayHighScorePosition("Laurie", position));
    }

    public static int calculateFinalScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            return score + (levelCompleted * bonus);
        }
        return -1;
    }

    public static String displayHighScorePosition(String player, int position) {
        return player + " managed to get into position " +
                position + " on the high score table";
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;
    }
}
