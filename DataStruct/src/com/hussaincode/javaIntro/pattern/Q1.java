package com.hussaincode.javaIntro.pattern;

public class Q1 {
    public static void main(String[] args) {
        int n =5;
        p1(5);
    }
    static void p1(int n){
        for(int row =1; row<=n; row++){
            for (int col=1; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
