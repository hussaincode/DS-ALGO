package com.hussaincode.javaIntro.pattern;

public class Pattern4 {
    public static void main(String[] args) {
        pattern4(6);
    }
    static void pattern4(int n){
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
