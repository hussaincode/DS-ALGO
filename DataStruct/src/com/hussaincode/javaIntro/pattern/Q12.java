package com.hussaincode.javaIntro.pattern;

public class Q12 {
    public static void main(String[] args) {
        int n=5;
        p1(n);
    }
    static void p1(int n){
        for(int row =1; row<=2*n; row++){
            int numOfSpaces = row<=n ? row-1: 2*n-row;
            int totalColm = row<=n ? n-row+1: row-n;
            for (int i=1; i<=numOfSpaces;i++){
                System.out.print(" ");
            }
            for (int col=1; col<=totalColm; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
