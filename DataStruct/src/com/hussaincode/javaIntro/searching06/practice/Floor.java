package com.hussaincode.javaIntro.searching06.practice;

//Greatest number<=target elements
public class Floor {
    public static void main(String[] args) {
        int[] arr ={2,5,7,9,13,15};
        int target = 1;
        System.out.println(floor(arr,target));
    }

    static int floor(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        while (start<=end){
            //find the middle elements
            // int mid = (start+end)/2 ; //might be possible that (start+end) exceeds the limit of integer
            int mid=start+(end-start)/2;

            if (target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }else {
                return mid;
            }
        }
        return end;
    }

}
