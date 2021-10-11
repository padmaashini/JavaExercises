package com.company;

public class SpeedCalculator {

    public static long toMilesPerHour (double kilometersPerHour) {
        if(kilometersPerHour < 0) return -1;

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion (double kilometersPerHour) {
        long res = toMilesPerHour(kilometersPerHour);
        if(res == -1) System.out.println("Invalid Value");
        else System.out.println(kilometersPerHour + " km/h = " + res + " mi/h");
    }

}
