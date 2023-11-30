package com.hussaincode.javaIntro.pattern;

public class Q5 {
    public static void main(String[] args) {
        int n =5;
        p1(5);
    }
    static void p1(int n){
        for (int row=1;row<=2*n-1;row++){
            //for every row run the column
            int totalColsInRow = row > n ? 2*n-row: row;
            for (int col=1;col<=totalColsInRow;col++){
                System.out.print("* ");
            }
            //when one row is printed, need to add one line.
            System.out.println();
        }
    }
}
