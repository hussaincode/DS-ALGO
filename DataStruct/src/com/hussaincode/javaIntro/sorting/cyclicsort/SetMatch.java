package com.hussaincode.javaIntro.sorting.cyclicsort;

import java.util.Arrays;

//https://leetcode.com/problems/set-mismatch/
public class SetMatch {
    public static void main(String[] args) {

        int[] nums ={1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    static int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if (nums[i]!=nums[correct]) {
                swap(nums,i,correct);
            }else {
                i++;
            }
        }
        //search for first missing number
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                return new int[] {nums[index],index+1};
            }
        }
        //case 2
        return new int[] {-1,-1};
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
