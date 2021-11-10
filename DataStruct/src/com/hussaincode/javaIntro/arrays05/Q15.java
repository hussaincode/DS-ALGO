package com.hussaincode.javaIntro.arrays05;
//https://leetcode.com/problems/matrix-diagonal-sum/submissions/
public class Q15 {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println(diagonalSum(mat));
    }
    static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int principal = 0, secondary = 0;
        for (int i = 0; i < n; i++) {
            principal += mat[i][i];
            secondary += mat[i][n - i - 1];
        }
        return n%2 == 0 ? (principal + secondary) : (principal + secondary - mat[n/2][n/2]);
    }
}
