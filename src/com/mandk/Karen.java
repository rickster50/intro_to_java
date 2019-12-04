package com.mandk;
public class Karen {

    public static void main(String[] args) {
        int[] number = new int[100];
        for (int i = 0; i < 100; i++) {// first value = 0
            number[i] = i + 1;
        }

        int ans = 0;
        for (int i = 0; i < 100; i++) {
            ans += number[i]; // ans = ans + number[i];
        }
        System.out.println(ans);

    }
}


//int[] number = new int[100]; //create array with room for 100 integers
//for (int i=0; i<100;i++) {//for-loop
//   number[i] = i + 1;
//} //* +1 because we dont want 0-99 */
//int sum =0;
//for (int i:number){
//   sum += i;}
//System.out.println (sum);