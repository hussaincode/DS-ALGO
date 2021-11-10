package com.hussaincode.javaIntro.arrays05;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/lucky-numbers-in-a-matrix/submissions/
public class Q23 {
    public static void main(String[] args) {
        int[][] matrix={{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(matrix));
    }
    static List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> lucky = new ArrayList<>();
        int min;
        for(int i = 0; i < matrix.length; i++){
            min = minInRow(matrix, i);
            if (isMaxInCol(matrix, i, min)){
                lucky.add(matrix[i][min]);
            }
        }
        return lucky;
    }


    static int minInRow(int[][] matrix, int row){
        int min = matrix[row][0];
        int index = 0;
        for(int i = 1; i < matrix[row].length; i++){
            if(matrix[row][i] < min){
                min = matrix[row][i];
                index = i;
            }
        }
        return index;
    }

    static boolean isMaxInCol(int[][] matrix, int row, int col){
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][col] > matrix[row][col] ){
                return false;
            }
        }
        return true;
    }
}
