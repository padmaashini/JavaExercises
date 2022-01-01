package com.company;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if(first < 10 || second < 10) return -1;

        int minNum = Math.min(first, second);
        int GCD = 1;

        for(int i = 1; i <= minNum; i++) {
            if((first % i == 0) && (second % i == 0)) GCD = i;
        }
        return GCD;
    }
}
