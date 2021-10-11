package com.company;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double numOne, double numTwo) {
        int firstNum = (int)(numOne * 1000);
        int secondNum = (int)(numTwo * 1000);

        if(firstNum == secondNum) return true;
        else return false;
    }
}
