package com.tijch05;

public class GuessingGameRunner {
    public static void main(String [] args){
        new GuessUntilYouGetMyNumber(System.in, 100).playGame();
    }
}
