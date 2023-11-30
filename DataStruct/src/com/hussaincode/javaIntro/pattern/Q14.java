package com.hussaincode.javaIntro.pattern;

public class Q14 {
    public static void main(String[] args) {
        int n =5;
        p14(n);
    }
    static void p14(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int i = rows; i < n; i++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= (2 * n - 1); col++) {
                if (rows == 1 || col == rows || col == (2 * n - rows)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
