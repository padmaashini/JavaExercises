package com.company;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0) System.out.println("Invalid Value");
        else {
            int megaBytes = kiloBytes / 1024;
            int remainder = kiloBytes % 1024;
            System.out.println(String.format("%1$d KB = %2$d MB and %3$d KB", kiloBytes, megaBytes, remainder));
        }
    }
}
