package com.company;

import java.text.DecimalFormat;

public class SecondsAndMinutesChallenge {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static String getDurationString(int minutes, int seconds) {
        if(minutes < 0 || (seconds < 0 || seconds > 59)) return INVALID_VALUE_MESSAGE;

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        DecimalFormat formatter = new DecimalFormat("00");
        String strFormatted = String.format("%1$sh %2$sm %3$ss", formatter.format(hours),
                formatter.format(remainingMinutes), formatter.format(seconds));

        return strFormatted;
    }

    public static String getDurationString(int seconds) {
        if(seconds < 0) return INVALID_VALUE_MESSAGE;

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        String res = getDurationString(minutes, remainingSeconds);
        return res;
    }
}
