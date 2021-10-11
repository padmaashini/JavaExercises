package com.company;

public class Main {
    public static void main(String[] args) {
        
        //Test ScoreCalculator Class
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScoreOne = ScoreCalculator.calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Final Score One: " + finalScoreOne);

        score = 10_000;
        levelCompleted = 8;
        bonus = 200;

        int finalScoreTwo = ScoreCalculator.calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Final Score Two: " + finalScoreTwo);

        int highScoreOne = ScoreCalculator.calculateHighScorePosition(finalScoreOne);
        int highScoreTwo = ScoreCalculator.calculateHighScorePosition(finalScoreTwo);

        ScoreCalculator.displayHighScorePosition("Player One", highScoreOne);
        ScoreCalculator.displayHighScorePosition("Player Two", highScoreTwo);

        int highScoreThree = ScoreCalculator.calculateHighScorePosition(1500);
        int highScoreFour = ScoreCalculator.calculateHighScorePosition(900);
        int highScoreFive = ScoreCalculator.calculateHighScorePosition(400);
        int highScoreSix = ScoreCalculator.calculateHighScorePosition(50);

        ScoreCalculator.displayHighScorePosition("Player Three", highScoreThree);
        ScoreCalculator.displayHighScorePosition("Player Four", highScoreFour);
        ScoreCalculator.displayHighScorePosition("Player Five", highScoreFive);
        ScoreCalculator.displayHighScorePosition("Player Six", highScoreSix);

        //Testing SpeedCalculator Class
        SpeedCalculator.printConversion(1.5);

        //Testing MegaBytesConverter Class
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);

        //Testing BarkingDog Class
        boolean wakeUp = BarkingDog.shouldWakeUp(true, 1);
        System.out.println("Wake up for params: true and 1 --> " + wakeUp);

        wakeUp = BarkingDog.shouldWakeUp(false, 2);
        System.out.println("Wake up for params: false and 2 --> " + wakeUp);

        wakeUp = BarkingDog.shouldWakeUp(true, 8);
        System.out.println("Wake up for params: true and 8 --> " + wakeUp);

        wakeUp = BarkingDog.shouldWakeUp(true, -1);
        System.out.println("Wake up for params: true and -1 --> " + wakeUp);

    }
}
