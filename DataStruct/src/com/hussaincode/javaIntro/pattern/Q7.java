package com.hussaincode.javaIntro.pattern;

public class Q7 {
    public static void main(String[] args) {
        int n =5;
        p1(5);
    }
    static void p1(int n){
        for(int row =1; row<=n; row++){
            int numOfSpaces = row-1;
            for (int i=1; i<=numOfSpaces;i++){
                System.out.print(" ");
            }
            for (int col=1; col<=n-row+1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
