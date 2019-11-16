package com.tijch03;

import java.util.Scanner;
import java.util.Random;

//import java.lang.Math;

public class GuessMyNumber {

    static Scanner in = new Scanner(System.in);
    static int guess;

    public static void main(String[] args) {
        System.out.println("I'm thinking of a number between 1 and 100 (inc both) can you guess what it is?");
        guess = in.nextInt();
        System.out.println("Your guess is: " + guess);

        Random random = new Random();
        int number = random.nextInt(100)+1;
        System.out.println("The number I was thinking of is: " + number);
        System.out.println("You were off by: " + Math.abs(number - guess) );
    }
}
