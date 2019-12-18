package com.tijch06;

import java.util.*;


public class findThatString {

    public static String[] letterSource;
//    public static List<String> chosen = new ArrayList<>();
    public static String stringToBeFound = "abc";

    public static int iterationCount = 0;

    public static void main(String[] args) {

        initialiseLetterSource();

        while(notMatching(getCandidateString())){
            iterationCount++;
        }
        System.out.println("Found the string " + stringToBeFound + " in " +iterationCount + " iterations. " +
                "The probability of candidate string found in one iteration was " + 1.0/calculateFactorial(letterSource.length));
    }

    private static int calculateFactorial(int n) {
        if (n<=2) {
            return n;
        }
        return n * calculateFactorial(n-1);
    }
    private static String[] initialiseLetterSource(){
        //generalise so that the length of the letter source can be set
        letterSource = new String[]{"a","b", "c", "e", "d"};
        return letterSource;
    }

    private static String getCandidateString(){
        //int lengthOfLetterSource = letterSource.length;
        int lengthOfCandString = stringToBeFound.length();
        String candidateString = "";
//        boolean alreadyChosen = true;
        Random r = new Random();

        for (int i=0; i<lengthOfCandString; i++) {
            candidateString += letterSource[r.nextInt(letterSource.length)];
        }

//        while (alreadyChosen == true) {
//
//            if (!chosen.contains(candidateString)){
//                alreadyChosen = false;
//                chosen.add(candidateString);
//            }
//        }
        return candidateString;
    }

    private static boolean notMatching(String s){
        return (! s.equals(stringToBeFound));
    }

}