package com.hussaincode.javaIntro.recusrion.easy;

//https://leetcode.com/problems/fibonacci-number/
public class Q07 {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }
    public static int fib(int n) {
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
