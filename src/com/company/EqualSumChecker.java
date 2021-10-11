package com.company;

public class EqualSumChecker {
    public static boolean hasEqualSum(int numOne, int numTwo, int numThree) {
        int sum = numOne + numTwo;
        if (sum == numThree) return true;
        return false;
    }
}
