package com.company;

public class NumberToWords {
    public static int reverse(int number) {
        int originalNumber = number;
        if(number < 0) number *= -1;

        int newNumber = 0;

        while(number > 0) {
            int digit = number % 10;
            newNumber *= 10;
            newNumber += digit;
            number /= 10;
        }
        if(originalNumber < 0) newNumber *= -1;
        return newNumber;
    }

    public static int getDigitCount (int number) {
        if(number == 0) return 1;
        if(number < 0) return -1;
        int numberOfDigits = 0;
        while(number > 0) {
            numberOfDigits++;
            number /= 10;
        }
        return numberOfDigits;
    }

    public static void numberToWords(int number) {
        if(number < 0) System.out.println("Invalid Value");
        if(number == 0) System.out.println("Zero");

        int reversedNumber = reverse(number);

        int originalCount= getDigitCount(number);
        int reversedCount = getDigitCount(reversedNumber);

        while(reversedNumber > 0) {
            int digit = reversedNumber % 10;

            switch(digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Not a valid number");
                    break;
            }

            reversedNumber /= 10;
        }

        if(originalCount != reversedCount) {
            int difference = originalCount - reversedCount;
            for(int i=0; i < difference; i++) {
                System.out.println("Zero");
            }
        }
    }
}
