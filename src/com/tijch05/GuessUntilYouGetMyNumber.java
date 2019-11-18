package com.tijch05;

import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;


public class GuessUntilYouGetMyNumber {

    private static final String START_PROMPT_TEXT = "I'm thinking of a number between 1 and %d (inc both) can you guess what it is?";
    private static final String NEXT_GUESS_PROMPT_TEXT = "You've guessed %d, you are too %s";
    private static final String VICTORY_MESSAGE = "You are awesome, you took %d guesses";


    private Scanner inputScanner;
    private int upperBound;
    private int yourGuess;
    private int myNumber;
    private int numberOfGuesses;

    public GuessUntilYouGetMyNumber(InputStream sourceOfGuesses, int max){
        inputScanner = new Scanner(sourceOfGuesses);
        myNumber = new Random().nextInt(max)+1;
        numberOfGuesses = 0;
        upperBound = max;
    }
    public void playGame() {
        display(getAppropriatePromptForNextGuess());
        getGuessFromPrompt();
        if (guessIsCorrect()) {
            display(getVictoryMessage());
        } else {
            playGame();
        }
    }

    private void getGuessFromPrompt(){
            yourGuess = inputScanner.nextInt();
            numberOfGuesses++;
    }
    private boolean guessIsCorrect(){
        return yourGuess == myNumber;
    }
    private void display(String prompt){
        System.out.println(prompt);
    }
    private String getAppropriatePromptForNextGuess(){
        assert(yourGuess != myNumber);
        if (numberOfGuesses == 0) {
            return String.format(START_PROMPT_TEXT,upperBound);
        }
        else if ( (myNumber - yourGuess) > 0 ){
            return String.format(NEXT_GUESS_PROMPT_TEXT,yourGuess,"low");
        }
        else {
            return String.format(NEXT_GUESS_PROMPT_TEXT,yourGuess,"high");
        }
    }
    private String getVictoryMessage(){
        return String.format(VICTORY_MESSAGE, numberOfGuesses);
    }

}
