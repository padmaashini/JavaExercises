package com.company;

public class LastDigitChecker {

    public static boolean isValid (int number) {
        return !(number < 10 || number > 1000);
    }

    public static boolean hasSameLastDigit(int numOne, int numTwo, int numThree) {
        if(!(isValid(numOne)) || !(isValid(numTwo)) || !(isValid(numThree))) return false;
        int numOneLast = numOne % 10;
        int numTwoLast = numTwo % 10;
        int numThreeLast = numThree % 10;

        return (numOneLast == numTwoLast || numOneLast == numThreeLast || numTwoLast == numThreeLast);
    }


}
