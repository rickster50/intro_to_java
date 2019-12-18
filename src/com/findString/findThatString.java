package com.findString;

import java.util.*;

/* Change this to do the following
 * getCandidateString should use a for loop again, or another type of approach so that we can change the length of the
 * candidate string without changing the code further - the candidate should continue to be randomly generated
 *
 * Change the class so it no longer uses static methods and variables - so that we can create multiple instances of the
 * class and run them
 *
 * The target is to be able to enter a letter source, and a candidate string, have
 * the probability of candidate string being found in one iteration calculated and displayed
 * then the program to run and display the number of iterations actually required to get the candidate string*/

public class findThatString {
    //TBD: allow user input for letter source
    String[] letterSource = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

    Scanner in = new Scanner(System.in);
    String stringToBeFound = in.nextLine();
    int L = letterSource.length;
    int l = stringToBeFound.length();

    public static void main(String[] args) {

        System.out.println("Welcome to String Searching Speed Contest! " +
                "Please enter a candidate string below consisting of letters a to j.");

        Calculator a = new Calculator();
        int iterationCount = 1;

        while(true){
            String guess = a.getCandidateString();
            if (a.matching(guess)) {
                break;
            }
            System.out.println("Iteration " + iterationCount++ + ": " + guess);// x++ returns x value then adds 1 ++x adds 1 then returns x value
        }
        System.out.println("Found the string " + a.stringToBeFound + " in " + iterationCount + " iterations.");
        System.out.println("The probability of the candidate string " + a.stringToBeFound + " found in one iteration was " + a.probability());
    }

    public String getCandidateString(){
        String candidateString = "";
        Random r = new Random();

        for (int i=0; i<l; i++) {
            candidateString += letterSource[r.nextInt(L)];
        }
        return candidateString;
    }

    public boolean matching(String s){
        return (s.equals(stringToBeFound));
    }

}
