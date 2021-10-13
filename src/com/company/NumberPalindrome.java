package com.company;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        if(number >=0 && number <10) return true;
        if(number < 0) return isPalindrome(-1*number);

        int originalNumber = number;
        int reverse = 0;
        while(number > 0) {
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number = number/10;
        }
        return originalNumber == reverse;
    }
}
