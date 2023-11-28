package com.hussaincode.javaIntro.complexity;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(fiboFormula(50));
    }

    static int fiboFormula(int n){
       return (int)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }

    //this won't work for large number like 50 because
    static int fibo(int n){
        if(n<2)
            return n;

        return fibo(n-1)+fibo(n-2);
    }
}
