package com.company;

public class DiagonalStar {
    public static void printSquareStar(int number) {
        if(number < 5) System.out.println("Invalid Value");
        else {
            for(int i=0; i< number; i++) {
                for(int j=0; j<number; j++) {
                    Boolean printStar = false;
                    if(i == 0 || j == 0) printStar = true;
                    if(i == number-1 || j == number-1) printStar = true;
                    if(i == j) printStar = true;
                    if(j == number - i -1 ) printStar = true;
                    if(printStar) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
