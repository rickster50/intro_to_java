package com.tijch06;

public class LoopDemo {

    public static void main(String [] args){

        //while loop continues to execute the statement(s) in the brackets { } while a condition is true
        int j = 0;
        while (j<=9){
            System.out.println("Hello while loop 1 " + j++);
        }

        //do while loop executes the statement(s) in the brackets {} at least once,
        // then continues to execute whilst the condition is true
        do {
            System.out.println("Hello do loop");
        }
        while (false);

        //for loop used to execute statements n times, where n is a function of the starting position
        // the increment, and the condition
        //these elements are put into the () after the for
        for (int k = 0; k<=9 ;k++){
            System.out.println("Hello for loop " + k);
        }

        /*s a general principle use for loops for counting like situations i.e..
        where you expect to get closer to the condition which will terminate the loop after each execution
        and while loops where the truth or falsehood of the conditions is governed by factors external to the code executed
        in the loop, e.g. time passing, an event occurring, */

        int i = 0;
        while (i<=9){
            System.out.println("Hello " + i);
         System.out.println(i++); //increment i++ is post increment - returns the value before it is incremented
                                 // on the first iteration Hello 0
         System.out.println(++i); //increment ++i is pre increment - returns value after it is incremented
        }


        //for loop - starting position, test, increment
        for (int k = 0; k<=9 ;k++){
            System.out.println("Hello for loop " + k);
        }


    }
}
