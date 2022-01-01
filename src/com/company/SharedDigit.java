package com.company;

public class SharedDigit {
    public static boolean hasSharedDigit(int numOne, int numTwo) {
        if(numOne < 10 || numOne > 99 || numTwo < 10 || numTwo > 99) return false;

        int numOneLast = numOne % 10;
        int numTwoLast = numTwo % 10;

        int numOneFirst = numOne / 10;
        int numTwoFirst = numTwo / 10;

        boolean hasSharedDig = numOneLast == numTwoLast || numOneLast == numTwoFirst || numOneFirst == numTwoLast
                || numOneFirst == numTwoFirst;

        return hasSharedDig;

    }
}
