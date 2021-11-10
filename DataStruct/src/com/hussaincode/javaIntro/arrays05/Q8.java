package com.hussaincode.javaIntro.arrays05;

import java.util.Arrays;
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class Q8 {
    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            int count=0;
            for (int j=0;j<nums.length;j++){
                if (nums[j] < nums[i]){
                    ans[i]=++count;
                }
            }
        }
       return ans;
    }
}
