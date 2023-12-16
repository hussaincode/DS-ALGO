package com.hussaincode.javaIntro.recusrion.easy;
//https://www.hackerrank.com/challenges/30-recursion/problem
public class Q21 {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
    public static int factorial(int n) {
        // Write your code here
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);

    }
}
