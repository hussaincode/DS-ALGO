package com.hussaincode.javaIntro.pattern;

public class Q13 {
    public static void main(String[] args) {
        int n =6;
        p13(n);
    }
    static void p13(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int i = rows; i < n; i++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= (2 * rows - 1); col++) {
                if (col == 1 || rows == n || col == (2 * rows - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
