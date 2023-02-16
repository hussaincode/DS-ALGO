package com.hussaincode.javaIntro.searching06.practice;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/ - easy
//https://leetcode.com/problems/find-peak-element/submissions/899121770/ - medium
public class MountainArray {

    public static void main(String[] args) {
        int[] arr ={0,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {

        int start =0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
             //you are in decreasing part of array
             //this maybe the ans  but look atb left
             //this is why end!=mid-1
             end=mid;
            } else {
                //you are in ascending part of array
                start=mid+1; //bcs we know that mid+1 element>mid element
            }
        }

        //in the end, start==end and pointing to the largest number because of the 2 checks above
        //start and end are trying to find maximum element in the above 2 checks
        // hence when they are just pointing to one element that is the max element
        return start;  //we can return end as well as both are equal
    }
}
