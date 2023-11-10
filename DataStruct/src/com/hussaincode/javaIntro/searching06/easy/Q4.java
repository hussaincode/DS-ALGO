package com.hussaincode.javaIntro.searching06.easy;
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
public class Q4 {
    public static void main(String[] args) {
       int[] numbers = {2,7,11,15};
       int target = 9;
        System.out.println(twoSum(numbers,target));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int lowIndex =0;
        int highIndex = numbers.length-1;

        for(int i=0; i < numbers.length; i++){
            int sum = numbers[lowIndex]+numbers[highIndex];
            if(sum == target)
                return new int[]{lowIndex+1, highIndex+1};
            else if(sum < target)
                lowIndex++;
            else
                highIndex--;
        }

        return new int[]{};
    }
}
