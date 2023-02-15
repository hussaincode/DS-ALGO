package com.hussaincode.javaIntro.searching06.practice;


import java.util.Arrays;

//https://www.geeksforgeeks.org/count-number-of-occurrences-or-frequency-in-a-sorted-array/
public class CountOccurence {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 2, 3,};
        int target =2;
        System.out.println(searchRange(arr,target));
    }

    static int searchRange(int[] nums, int target) {
        int [] ans={-1,-1};
        int count=0;
//        check the first occurence of target
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        count = end-start+1;
        return count;
    }
    static int search(int [] nums,int target,boolean findStartIndex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            //Find the mid element
//            int mid=(start+end)/2;  //might give error bcs of start+end may exceed the int limit.
            int mid=start+(end-start)/2;
            if (target<nums[mid]){
                end=mid-1;
            }else if (target>nums[mid]){
                start=mid+1;
            }else {
                ans= mid;
                if (findStartIndex){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }

}
