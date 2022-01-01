package com.company;

import java.util.*;

public class ReadingUserInput {
    public static void readInput() {
        int count = 1;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        while (count <= 10) {
            System.out.println("Enter number #" + count + ": ");
            if(scanner.hasNextInt()) {
                int newNumber = scanner.nextInt();
                sum += newNumber;
                count++;
            } else {
                System.out.println("Invalid  Number");
            }

            //prevents endless loop due to unforeseen input
            scanner.nextLine(); //handle end of line (enter key)
        }
        System.out.println("The sum of the numbers is: " + sum);
        scanner.close();
    }
}
