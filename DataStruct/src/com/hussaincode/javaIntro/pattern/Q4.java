package com.hussaincode.javaIntro.pattern;

public class Q4 {
    public static void main(String[] args) {
        int n =5;
        p1(5);
    }
    static void p1(int n){
        for(int row =1; row<=n; row++){
            for (int col=1; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
