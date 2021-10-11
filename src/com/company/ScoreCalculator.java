package com.company;

public class ScoreCalculator {

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int returnValue = gameOver ? (score + (levelCompleted * bonus)) + 2000 : -1;
        return returnValue;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(String.format("%s managed to get into position %d on the high score table.", playerName, position));
    }

    public static int calculateHighScorePosition(int playerScore) {
        int highScore;
        if (playerScore >= 1000) highScore = 1;
        else if (playerScore >= 500) highScore = 2;
        else if (playerScore >= 100) highScore = 3;
        else highScore = 4;
        return highScore;
    }
}
