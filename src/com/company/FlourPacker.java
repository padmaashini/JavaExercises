package com.company;

public class FlourPacker {
    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0) return false;

        int bigBagKilo = bigCount * 5;
        int smallBagKilo = smallCount;

        if((bigBagKilo + smallBagKilo) < goal) return false;
        return goal%5 <= smallBagKilo;
    }
}
