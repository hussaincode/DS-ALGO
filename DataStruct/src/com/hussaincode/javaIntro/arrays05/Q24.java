package com.hussaincode.javaIntro.arrays05;

//https://leetcode.com/problems/maximum-subarray/submissions/
public class Q24 {
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for(int i = 1; i < n; i++) {
            if(maxEndingHere + nums[i] < nums[i]) {
                maxEndingHere = nums[i];
            } else {
                maxEndingHere = maxEndingHere + nums[i];
            }

            if(maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
            }
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));

    }

}
