package com.tijch04;

public class MG_DateFormat {

    public static void main(String[] args){
        String day = "Monday", month = "November";
        int date = 18, year = 2019;
        printEuro(day,date,month,year);
        printAmerican(day, date, month, year);
    }

    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println("American format:");
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuro(String day, int date, String month, int year){
        System.out.println("European format:");
        System.out.println(day + " " + date + " " + month + " " + year);
    }
}
