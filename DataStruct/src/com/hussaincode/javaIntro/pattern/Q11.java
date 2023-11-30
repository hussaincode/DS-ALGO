package com.hussaincode.javaIntro.pattern;

public class Q11 {
    public static void main(String[] args) {
        int n=5;
        p1(n);
    }
    static void p1(int n){
        for(int row =0; row<n; row++){

            for (int i=1; i<=row;i++){
                System.out.print(" ");
            }
            for (int col=row*2+1; col<=2*n-row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
