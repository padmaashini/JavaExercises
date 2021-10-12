package com.company;

public class YearsAndDays {
    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) System.out.println("Invalid Value");
        else {
            long hours = minutes / 60;
            long totalDays = hours / 24;
            long years = totalDays / 365;
            long remainingDays = totalDays % 365;

            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }
}
