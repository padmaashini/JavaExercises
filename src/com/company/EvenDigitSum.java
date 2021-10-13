package com.company;

public class EvenDigitSum {
    public static int getEvenDigitSum (int number) {
        if(number < 0) return -1;

        int evenSum = 0;

        while(number > 0) {
            //going through the digits from the end to beginning
            int digit = number % 10;
            if(digit % 2 == 0) evenSum += digit;
            number /= 10;
        }

        return evenSum;
    }
}
