package com.hussaincode.javaIntro.arrays05.Medium;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
    static List spiralOrder(int[][] matrix) {
        int i;
        List list = new ArrayList<>();
        int k=0,l=0;
        int row=matrix.length -1;
        int col=matrix[0].length-1;
        while(k<=row && l<= col) {
            for(i=l;i<=col;i++) {
                list.add(matrix[k][i]);
            }
            k++;

            for(i=k;i<=row;i++) {
                list.add(matrix[i][col]);
            }
            col--;
            if(k<= row) {
                for(i= col;i>=l;i--) {
                    list.add(matrix[row][i]);
                }
            }
            row--;
            if(l<=col) {
                for(i=row;i>=k;i--) {
                    list.add(matrix[i][l]);
                }
            }
            l++;
        }
        return list;
    }
}
