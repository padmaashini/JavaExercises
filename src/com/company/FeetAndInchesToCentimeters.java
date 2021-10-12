package com.company;

public class FeetAndInchesToCentimeters {

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        if(!(feet >= 0)) return -1;
        if(!(inches >=0 && inches <=12)) return -1;

        double totalInches = (feet *12) + inches;
        double totalCentimeters = totalInches * 2.54;
        return totalCentimeters;
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        if(inches < 0) return -1;
        if (inches > 12) {
            double feet = (int) inches / 12;
            double remainderInches = (int) inches % 12;

            return calcFeetAndInchesToCentimeters(feet, remainderInches);
        } else return inches * 2.54;
    }
}
