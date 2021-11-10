package com.hussaincode.javaIntro.arrays05;

import java.util.Arrays;

//Concatenation of Array
public class Q2 {
    public static void main(String[] args) {
        int[] nums={1,2,1};
        getConcatenation(nums);
    }
    static int[] getConcatenation(int[] nums) {
        int l = nums.length;
        int[] ans = new int[l * 2];
        for (int i=0; i<l; i++)
            ans[i] = ans[l+i] = nums[i];
        System.out.println(Arrays.toString(ans));
        return ans;

    }
}
