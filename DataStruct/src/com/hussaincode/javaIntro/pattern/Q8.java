package com.hussaincode.javaIntro.pattern;

public class Q8 {
    public static void main(String[] args) {
        int n=5;
        p1(n);
    }
    static void p1(int n){
        for(int row =1; row<=n; row++){
            int numOfSpaces = n-row;
            for (int i=1; i<=numOfSpaces;i++){
                System.out.print(" ");
            }
            for (int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
