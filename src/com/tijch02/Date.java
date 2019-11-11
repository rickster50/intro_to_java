package com.tijch02;

public class Date {
    public static void main(String [] args){

        String day = "Sunday";
        String month = "November";
        int date = 10;
        int year = 2002;
        System.out.println(day + ", " + month + " " + date + ", "+year);
        System.out.printf("%s, %s %d, %d\n",day,month,date,year);
        /*%s is a string %d is a number these values are substituted in from the arguments of the format function.
        The \n is a special character which starts a new line, could use %n*/

        String usDateFormat = "%s, %s %d, %d"; // e.g. Thursday, July 16, 2015
        String euroDataFormat = "%s %d %s %d"; // e.g. Thursday 16 July 2015

        // we can define the format as a String in advance of calling the format method - why might we do that?

        String usDate = String.format(usDateFormat,day,month,date,year);
        String euroDate = String.format(euroDataFormat,day,date,month,year);
        //what don't I like about the above?

        System.out.println("American format\n"+usDate);
        System.out.println("European format\n" +euroDate);

    }
}
