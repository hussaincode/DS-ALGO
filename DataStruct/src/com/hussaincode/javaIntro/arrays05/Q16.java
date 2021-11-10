package com.hussaincode.javaIntro.arrays05;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/
public class Q16 {
    public static void main(String[] args) {
        int[] nums={437,315,322,431,686,264,442};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int even = 0;
        for (int i = 0; i < nums.length-1; i++) {
            int count = 0;
            int n = nums[i];
            while (n > 0) {
                n = n / 10;
                ++count;
            }
            if (count % 2 == 0) {
                even++;
            }
        }
        return even;
    }
}
