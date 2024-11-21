package org.example;

public class Fibonacci {

    public static int getFibonacci(int i) {
        if(i <=1){
            return i;
        }
        return getFibonacci(i-1)+getFibonacci(i-2);
    }
}
