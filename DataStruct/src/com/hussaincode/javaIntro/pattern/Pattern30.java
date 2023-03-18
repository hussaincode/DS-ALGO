package com.hussaincode.javaIntro.pattern;

public class Pattern30 {
    public static void main(String[] args) {
        pattern30(6);
    }
    static void pattern30(int n){
        for (int row=1;row<=n;row++){
            //for every row run the column

            for (int spaces=0;spaces<n-row;spaces++){
                System.out.print("  ");
            }
            for (int col=row;col>=1;col--){
                System.out.print(col+" ");
            }
            for (int col=2;col<=row;col++){
                System.out.print(col+" ");
            }
            //when one row is printed, need to add one line.
            System.out.println();
        }
    }
}
