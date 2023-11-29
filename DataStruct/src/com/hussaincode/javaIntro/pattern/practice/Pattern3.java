package com.hussaincode.javaIntro.pattern.practice;

public class Pattern3 {
    public static void main(String[] args) {
        pattern3(4);
    }
    static void pattern3(int n){
        for (int row=1;row<=n;row++){
            //for every row run the column
            for (int col=n;col>=row;col--){  //for(int col=1;col<=n-row+1;col++) - we can use this logic as well
                System.out.print("* ");
            }
            //when one row is printed, need to add one line.
            System.out.println();
        }
    }
}
