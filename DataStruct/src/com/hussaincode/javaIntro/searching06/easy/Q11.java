package com.hussaincode.javaIntro.searching06.easy;

//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/
public class Q11 {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {
        int count =0;
        for(int i=0; i<grid.length; i++){
            int start = 0;
            int end = grid[i].length-1;
            while(start<=end){
                int mid = start+(end-start)/2;
                if(grid[i][mid]<0){
                    count=count+end-mid+1;
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return count;
    }
}
