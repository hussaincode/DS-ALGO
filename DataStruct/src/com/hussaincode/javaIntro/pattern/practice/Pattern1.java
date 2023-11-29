package com.hussaincode.javaIntro.pattern.practice;

/*
**
***
****/

public class Pattern1 {
    public static void main(String[] args) {
        pattern1(4);
    }
    static void pattern1(int n){
        for (int row=1;row<=n;row++){
            //for every row run the column
            for (int col=1;col<=row;col++){
                System.out.print("* ");
            }
            //when one row is printed, need to add one line.
            System.out.println();
        }
    }
}
