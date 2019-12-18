package com.findString;
public class Calculator extends findThatString {

    int sub_l = l;
    int perm = 0;

    public int factorial(int n) {
        // n must be >= 0
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public int choose(int m, int n) {
        // user must enter m >= n
        return factorial(m) / (factorial(n) * factorial(m - n));
    }

    public int permutation(int k, int m, int n) {
        while (! (n == 0)) {
            perm += choose(k, n) * choose(m, n) * factorial(n);
            n--;
        }
        return perm;
    }

    public double probability() {
        return 1.0/this.permutation(L, l, sub_l);
    }
}
