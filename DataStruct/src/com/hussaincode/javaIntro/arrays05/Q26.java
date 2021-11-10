package com.hussaincode.javaIntro.arrays05;

import java.util.Arrays;
//https://leetcode.com/problems/plus-one/submissions/
public class Q26 {
    public static void main(String[] args) {
        int[] digits={1,2,3};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    static int[] plusOne(int[] digits) {
        int n = digits.length - 1;

        while(n>=0){
            var current = digits[n];
            if(current + 1 <= 9) {
                digits[n] += 1;
                return digits;
            } else {
                digits[n--] = 0;
                if(n == -1){
                    int[] res = new int[digits.length + 1];
                    res[0] = 1;
                    return res;
                }
            }
        }
        return digits;
    }
}
