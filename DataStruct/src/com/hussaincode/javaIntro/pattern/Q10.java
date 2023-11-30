package com.hussaincode.javaIntro.pattern;

public class Q10 {
    public static void main(String[] args) {
        int n=5;
        p1(n);
    }
    static void p1(int n){
        for(int row =0; row<n; row++){
            int numOfSpaces = n-row;
            for (int i=1; i<=numOfSpaces;i++){
                System.out.print(" ");
            }
            for (int col=1; col<=row*2+1; col++){
                System.out.print("*");
            }
            // this space is optional if you want you can give if you wont't give still program will work as it's in the last.
            for (int i=1; i<=numOfSpaces;i++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
