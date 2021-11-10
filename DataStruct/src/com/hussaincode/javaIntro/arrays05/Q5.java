package com.hussaincode.javaIntro.arrays05;

import java.util.Arrays;
//https://leetcode.com/problems/shuffle-the-array/submissions/
public class Q5 {
    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        int n=3;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] ans=new int[nums.length];
        int i=0,j=0,k=1;
        while(i<n){
            ans[j]=nums[i];
            ans[k]=nums[n+i];
            j=j+2; k=k+2;
            i++;
        }
        return ans;
    }
}
