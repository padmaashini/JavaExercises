package com.company;

import java.awt.geom.Area;

public class Main {
    public static void main(String[] args) {

        //Test SecondsAndMinutesChallenge Class
        String time = SecondsAndMinutesChallenge.getDurationString(62, 21);
        System.out.println(time);

        time = SecondsAndMinutesChallenge.getDurationString(200);
        System.out.println(time);

        //Test AreaCalculator Class
        double areaOfCircle = AreaCalculator.area(2.3);
        System.out.println("Area of circle of radius 2.3: " + areaOfCircle);

        double areaOfRectangle = AreaCalculator.area(2.0, 4.9);
        System.out.println("Area of rectangle with length 2.0 and width 4.9: " + areaOfRectangle);

        //Test YearsAndDays Class
        YearsAndDays.printYearsAndDays(525_600);
        YearsAndDays.printYearsAndDays(561_600);

        //Test EqualityPrinter Class
        EqualityPrinter.printEqual(1, 1, 1);
        EqualityPrinter.printEqual(1, 1, 2);
        EqualityPrinter.printEqual(1, 2, 3);

        //Test PlayingCat Class
        boolean isCatPlaying = PlayingCat.isCatPlaying(true, 10);
        System.out.println(isCatPlaying);

        isCatPlaying = PlayingCat.isCatPlaying(false, 35);
        System.out.println(isCatPlaying);

        //Test DayOfTheWeek Class
        //switch statements
        DayOfTheWeek.printDayOfTheWeek(9);


        //Test FeetAndInchesToCentimeters Class
//        double centimeters = FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(6, 0);
//        System.out.println("6 ft 0 inches = " + centimeters);
//
//        centimeters = FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(156);
//        System.out.println("6 inches = " + centimeters);
        
//        //Test ScoreCalculator Class
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//        int finalScoreOne = ScoreCalculator.calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Final Score One: " + finalScoreOne);
//
//        score = 10_000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        int finalScoreTwo = ScoreCalculator.calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Final Score Two: " + finalScoreTwo);
//
//        int highScoreOne = ScoreCalculator.calculateHighScorePosition(finalScoreOne);
//        int highScoreTwo = ScoreCalculator.calculateHighScorePosition(finalScoreTwo);
//
//        ScoreCalculator.displayHighScorePosition("Player One", highScoreOne);
//        ScoreCalculator.displayHighScorePosition("Player Two", highScoreTwo);
//
//        int highScoreThree = ScoreCalculator.calculateHighScorePosition(1500);
//        int highScoreFour = ScoreCalculator.calculateHighScorePosition(900);
//        int highScoreFive = ScoreCalculator.calculateHighScorePosition(400);
//        int highScoreSix = ScoreCalculator.calculateHighScorePosition(50);
//
//        ScoreCalculator.displayHighScorePosition("Player Three", highScoreThree);
//        ScoreCalculator.displayHighScorePosition("Player Four", highScoreFour);
//        ScoreCalculator.displayHighScorePosition("Player Five", highScoreFive);
//        ScoreCalculator.displayHighScorePosition("Player Six", highScoreSix);
//
//        //Testing SpeedCalculator Class
//        SpeedCalculator.printConversion(1.5);
//
//        //Testing MegaBytesConverter Class
//        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
//
//        //Testing BarkingDog Class
//        boolean wakeUp = BarkingDog.shouldWakeUp(true, 1);
//        System.out.println("Wake up for params: true and 1 --> " + wakeUp);
//
//        wakeUp = BarkingDog.shouldWakeUp(false, 2);
//        System.out.println("Wake up for params: false and 2 --> " + wakeUp);
//
//        wakeUp = BarkingDog.shouldWakeUp(true, 8);
//        System.out.println("Wake up for params: true and 8 --> " + wakeUp);
//
//        wakeUp = BarkingDog.shouldWakeUp(true, -1);
//        System.out.println("Wake up for params: true and -1 --> " + wakeUp);
//
//        //Testing LeapYear Class
//        boolean isLeapYear = LeapYear.isLeapYear(-1600);
//        System.out.println("Is Leap Year: -1600 --> " + isLeapYear);
//
//        isLeapYear = LeapYear.isLeapYear(1600);
//        System.out.println("Is Leap Year: 1600 --> " + isLeapYear);
//
//        isLeapYear = LeapYear.isLeapYear(2017);
//        System.out.println("Is Leap Year: 2017 --> " + isLeapYear);
//
//        isLeapYear = LeapYear.isLeapYear(2000);
//        System.out.println("Is Leap Year: 2000 --> " + isLeapYear);
//
//        //Testing DecimalComparator Class
//        boolean areDecimalsEqual = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
//        System.out.println("-3.1756 and -3.175 --> " + areDecimalsEqual);
//
//        areDecimalsEqual = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.176);
//        System.out.println("3.1756 and 3.176 --> " + areDecimalsEqual);
//
//        areDecimalsEqual = DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
//        System.out.println("3.0 and 3.0 --> " + areDecimalsEqual);
//
//        areDecimalsEqual = DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);
//        System.out.println("-3.123 and 3.123 --> " + areDecimalsEqual);
//
//        //Testing EqualSumChecker Class
//        boolean isEqualSumChecker = EqualSumChecker.hasEqualSum(1, 1, 1);
//        System.out.println("1 + 1 = 1 -->" + isEqualSumChecker);
//
//        isEqualSumChecker = EqualSumChecker.hasEqualSum(1, 1, 2);
//        System.out.println("1 + 1 = 2 -->" + isEqualSumChecker);
//
//        isEqualSumChecker = EqualSumChecker.hasEqualSum(1, -1, 0);
//        System.out.println("1 + -1 = 0 -->" + isEqualSumChecker);
//
//        //Testing TeenNumberChecker Class
//        boolean hasTeen = TeenNumberChecker.hasTeen(9, 99, 19);
//        System.out.println("9, 99, 19: hasTeen --> " + hasTeen );
//
//        hasTeen = TeenNumberChecker.hasTeen(23, 15, 42);
//        System.out.println("23, 15, 42: hasTeen --> " + hasTeen );
//
//        hasTeen = TeenNumberChecker.hasTeen(22, 23, 34);
//        System.out.println("22, 23, 34: hasTeen --> " + hasTeen );
//
//        boolean isTeen = TeenNumberChecker.isTeen(9);
//        System.out.println("9: isTeen --> " + isTeen );
//
//        isTeen = TeenNumberChecker.isTeen(13);
//        System.out.println("13: isTeen --> " + isTeen );

    }
}
