package com.hussaincode.javaIntro.arrays05;
//https://leetcode.com/problems/number-of-good-pairs/submissions/
public class Q7 {
    public static void main(String[] args) {
        int[] nums={1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
    static int count=0;
    static int numIdenticalPairs(int[] nums) {
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]==nums[j])  count++;

            }
        }
        return count;
    }
}
