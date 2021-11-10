package com.hussaincode.javaIntro.arrays05;

import java.util.Arrays;
//https://leetcode.com/problems/transpose-matrix/submissions/
public class Q17 {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(transpose(matrix)));
    }
    static int[][] transpose(int[][] matrix) {
        int[][] mat=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                mat[j][i]=matrix[i][j];
            }
        }
        return mat;
    }
}


