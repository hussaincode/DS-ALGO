package com.hussaincode.javaIntro.pattern;

public class Q3 {
    public static void main(String[] args) {
        int n =5;
        p1(5);
    }
    static void p1(int n){
        for(int row =1; row<=n; row++){
            for (int col=n-row+1; col>=1; col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
