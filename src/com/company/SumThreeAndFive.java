package com.company;

public class SumThreeAndFive {
    public static void sumThreeAndFive () {
        long sum = 0;
        long numOfElements = 0;
        for(int i=1; i <=1000; i++) {
            if((i%3 == 0) && (i%5 == 0)) {
                sum += i;
                numOfElements ++;
                System.out.println(i);
                if(numOfElements == 5) break;
            }
        }
        System.out.println("sum: " + sum);

    }
}
