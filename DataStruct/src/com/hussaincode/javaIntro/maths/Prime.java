package com.hussaincode.javaIntro.maths;

public class Prime {
    public static void main(String[] args) {
        int n =35;
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
