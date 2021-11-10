package com.hussaincode.javaIntro.arrays05;

import java.util.Arrays;

//Running Sum of 1d Array
public class Q3 {
    static  int sumOfArr=0;
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        runningSum(arr);
    }

    static int[] runningSum(int[] nums) {
        int ans[], a=0;
        ans = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            a= a+ nums[i];
            ans[i]=a;
        }
        System.out.print(Arrays.toString(ans));
        return ans;
    }
    //Generic Soln
    /* static void sum(int[] arr) {
        for (int i=0;i<arr.length;i++){
            sumOfArr +=arr[i];
        }
         System.out.println(sumOfArr);
    }*/

}
