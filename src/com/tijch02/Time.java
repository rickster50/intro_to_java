package com.tijch02;

public class Time {

    public static void main(String [] args) {
        int hours = 20;
        int mins = 14;
        int seconds = 30;

        //convert to seconds;
        int hoursInSeconds = 20 * 60 * 60;
        int minsInSeconds = 14 * 60;
        int secondsSinceMidnight = hoursInSeconds + minsInSeconds + seconds;

        System.out.println("Seconds since midnight");
        System.out.println(secondsSinceMidnight);

        int secondsInDay=60*60*24;

        int secondsLeftInDay = secondsInDay - secondsSinceMidnight;
        System.out.println("Seconds left in day");
        System.out.println(secondsLeftInDay);

    }

}
