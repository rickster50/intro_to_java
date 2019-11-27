package com.tijch06;

public class LoopDemo {

    public static void main(String [] args){
        //while loop continues while a condition is true
        int i = 0;
        while (i<=9){
            System.out.println("Hello " + i);
         System.out.println(i++); //increment i++ is post increment - returns value before it is incremented
         System.out.println(++i); //increment ++i is pre increment - returns value after it is incremented
        }

        //while loop continues while a condition is true
        int j = 0;
        while (j<=9){
            System.out.println("Hello " + j++);
        }

        //for loop - starting position, test, increment
        for (int k = 0; k<=9 ;k++){
            System.out.println("Hello for loop " + k);
        }
    }
}
