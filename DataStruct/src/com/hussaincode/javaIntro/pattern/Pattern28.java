package com.hussaincode.javaIntro.pattern;

public class Pattern28 {
    public static void main(String[] args) {
        pattern28(6);
    }
    static void pattern28(int n){
        for (int row=1;row<=2*n-1;row++){
            //for every row run the column
            int totalColsInRow = row > n ? 2*n-row: row;

            int noOfSpaces = n-totalColsInRow;
            for (int i=1;i<=noOfSpaces;i++){
                System.out.print(" ");
            }
            for (int col=1;col<=totalColsInRow;col++){
                System.out.print("* ");
            }
            //when one row is printed, need to add one line.
            System.out.println();
        }
    }
}
