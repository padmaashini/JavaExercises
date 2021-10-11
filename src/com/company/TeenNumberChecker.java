package com.company;

public class TeenNumberChecker {

    public static boolean hasTeen (int ageOne, int ageTwo, int ageThree) {
        int[] ageArray = { ageOne, ageTwo, ageThree };
        for(int i = 0; i < ageArray.length; i++){
            if(ageArray[i] >= 13 && ageArray[i] <= 19) return true;
        }
        return false;
    }

    public static boolean isTeen (int age) {
        return (age >= 13) && (age <= 19);
    }
}
