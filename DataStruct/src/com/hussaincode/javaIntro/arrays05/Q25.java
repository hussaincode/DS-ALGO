package com.hussaincode.javaIntro.arrays05;

import java.util.Arrays;
//https://leetcode.com/problems/reshape-the-matrix/submissions/
public class Q25 {
    public static void main(String[] args) {
        int[][] mat={{1,2},{3,4}};
        int r=2; int c=2;
        System.out.println(Arrays.deepToString(matrixReshape(mat,r,c)));
    }
    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows1 = mat.length;
        int cols1 = mat[0].length;
        int noofelement = rows1 * cols1;
        if (noofelement != r * c) {
            return mat;
        }

        int[][] newmatrix = new int[r][c];
        for (int i = 0; i < noofelement; i++) {

            newmatrix[i / c][i % c] = mat[i / cols1][i % cols1];
        }
        return newmatrix;
    }
}
