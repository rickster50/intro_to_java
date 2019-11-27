package com.tijch06;

public class LoopDemoScope {








    public static void main(String [] args){
        //while loop continues while a condition is true

        for (int i = 0;i<=9;i++){
            System.out.println("Hello " + i);
         System.out.println(i); //increment i++ is post increment - returns value before it is incremented
         System.out.println(++i); //increment ++i is pre increment - returns value after it is incremented
        }

        //while loop continues while a condition is true

       // int j = 0;
       // while (j<=9){
       //     System.out.println("Hello " + j++);
       // }

        //preferred when you want to execute code a certain number of times,
        // because the scope of the counter variable is restricted and all of the loop information is on one line
        for (int j = 0;j<=9;j++) {
            System.out.println("Hello " + j);
        }



        //for loop - starting position, test, increment
        for (int i = 0; i<=9 ;i++){
            System.out.println("Hello for loop " + i);
        }
    }
}
