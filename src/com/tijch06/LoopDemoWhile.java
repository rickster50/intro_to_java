package com.tijch06;

import java.util.Random;

public class LoopDemoWhile {

    static String testCond = "abc";
    static String testString = "abc";
    static String [] letterSource;

    /*Change this to do the following
    * getCandidateString should use a for loop again, or another type of approach so that we can change the length of the candidate
    * string without changing the code further - the candidate should continue to be randomly generated
    * Change the class so it no longer uses static methods and variables - so that we can create multiple instances of the class and run them
    *
    *
    * The target is to be able to enter a letter source, and a candidate string, have
    *  the probability of candidate string being found in one iteration calculated and displayed
    * then the program to run and display the number of iterations actually required to get the candidate string*/

    private static void initialiseLetterSource(){
        letterSource = new String[]{"a","b", "c", "e", "d"}; //letterSource[0] == "a" letterSource[4] == "d"
    }

    private static String getCandidateString(){
        String candidateString="";
        Random r = new Random();
        //for (int i = 0;i <= 2;i++) { // we could replace the loop with a recursive function plus condition to stop at 3
        //    int indexToArray = r.nextInt(5);
        //    System.out.println("letterSource["+indexToArray+"]");
        //    candidateString += letterSource[indexToArray];  // letterSource[r.nextInt produces and integer between 0 and 4] returns a string
        //}
        candidateString = letterSource[r.nextInt(5)] + letterSource[r.nextInt(5)] + letterSource[r.nextInt(5)];
        System.out.println(candidateString);
        return candidateString;
    }

    private  static boolean doesItMatch(String s){
        return (s.equals(testCond));
    }

    public static void main(String [] args) {
        initialiseLetterSource();
        int executionCount = 0;
        while(! doesItMatch(getCandidateString() )){
            System.out.println("Executed " + (++executionCount) + " times");
        }
    }
}
