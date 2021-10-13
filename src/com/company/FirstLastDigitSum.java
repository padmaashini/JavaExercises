package com.company;
public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) return -1;
        int lastDigit = number % 10;
        int firstDigit = number % 10;
        while(number > 0) {
            firstDigit = number % 10;
            number /= 10;
        }
        return lastDigit + firstDigit;
    }
}

