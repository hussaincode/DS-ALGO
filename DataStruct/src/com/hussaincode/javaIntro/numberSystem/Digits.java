package com.hussaincode.javaIntro.numberSystem;

public class Digits {
    public static void main(String[] args) {
        int n =134;
        System.out.println(findDigits(n));
    }
    static int findDigits(int n){
        return (int)Math.log10(n)+1;
    }
}
