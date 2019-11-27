package com.tijch06;

public class LoopDemoWhile {

    static String testCond = "abc";

    static String testString = "abc";


    static String [] letterSource;


    private static void initialiseLetterSource(){
        letterSource = new String[]{"a","b", "c", "e", "d"};
    }

    private static String getCandidateString(){
        System.out.println(letterSource[0] + letterSource[1] + letterSource[2]);
        return letterSource[0] + letterSource[1] + letterSource[2];
    }

    private  static boolean doesItMatch(String s){
        return (s.equals(testCond));
    }





    public static void main(String [] args) {
        initialiseLetterSource();
        String x = getCandidateString();

        System.out.println(doesItMatch(x));
    }
}
