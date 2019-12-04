package com.mandk;

public class Mhairi {

    public static void main(String[] args){
        int[] numbers = new int[100];
        for (int i = 0; i <100; i++){
            numbers[i] = i + 1;
        }
        int sum = 0;
        for (int i: numbers){
            sum += i;
        }
        System.out.println("Sum is " + sum);
    }


}
