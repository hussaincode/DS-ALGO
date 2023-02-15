package com.hussaincode.javaIntro.searching06.practice;
import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/586541267/

public class FristAndLast {

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int targert = 8;
        System.out.println(Arrays.toString(searchRange(nums,targert)));
    }

    static int[] searchRange(int[] nums, int target) {
        int [] ans={-1,-1};
//        check the first occurence of target
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
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
