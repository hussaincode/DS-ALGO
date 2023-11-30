package com.hussaincode.javaIntro.pattern;

public class Q15 {
    public static void main(String[] args) {
        int n =6;
        p13(n);
    }
    static void p13(int n) {
        for (int rows = 1; rows <= 2*n-1; rows++) {
            for (int i = rows; i < n; i++) {
                System.out.print(" ");
            }
            int numOfSpace = rows<=n ? (2 * rows - 1): (2 * n - 1);
            for (int col = 1; col <= numOfSpace; col++) {

                if(numOfSpace==(2 * rows - 1)) {
                    if (col == 1 || col == (2 * rows - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }else {
                    if (col == rows || col == (2 * n - rows)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
