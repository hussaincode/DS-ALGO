package com.hussaincode.javaIntro.searching06.practice;


//https://www.geeksforgeeks.org/order-agnostic-binary-search/
public class OrderAgnosticBS {
    public static void main(String[] args) {
      int arr[] = {40, 10, 5, 2, 1};
      int target=10;
        System.out.println(orderAgnosticSearch(arr,target));
    }

    static int orderAgnosticSearch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        if (arr[start]<arr[end]){
           return binarySearch(arr,target);
        }else {
            return revrseBinarySearch(arr,target);
        }
    }

    static int binarySearch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target == arr[mid]) {
                return mid;
            }else if (target>arr[mid]){
                start=mid+1;
            }else if (target<arr[mid]){
                end=mid-1;
            }
        }
        return -1;
    }
    static int revrseBinarySearch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target == arr[mid]) {
                return mid;
            }else if (target>arr[mid]){
                end=mid-1;
            }else if (target<arr[mid]){
                start=mid+1;
            }
        }
        return -1;
    }
}
