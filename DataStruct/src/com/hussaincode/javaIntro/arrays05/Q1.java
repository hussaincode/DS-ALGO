package com.hussaincode.javaIntro.arrays05;

import java.util.Arrays;

//
public class Q1 {
    public static void main(String[] args) {
       int[] nums = {5,0,1,2,3,4};
        buildArray(nums);
    }

    static int[] buildArray(int[] nums) {
        int ans[] =new int[nums.length];
        for (int i=0;i<nums.length;i++){
             ans[i] =nums[nums[i]];
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
