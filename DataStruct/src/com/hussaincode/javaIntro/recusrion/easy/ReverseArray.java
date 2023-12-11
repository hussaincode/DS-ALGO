package com.hussaincode.javaIntro.recusrion.easy;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        //  fun(arr,0,arr.length-1);
        // fun2(arr,0,arr.length);
        int[] arr = {10, 20, 30, 60, 50};
        int n = arr.length-1;
        reverseArrayByRecursion(arr,0,n);
        System.out.println(Arrays.toString(arr));
    }
    static void fun(int[] arr, int left, int right){
        if(left>=right){
            return;
        }
        swap(arr[left],arr[right]);
        fun(arr,left+1,right-1);

    }

    //solve using 1 parameter
    static void fun2(int[] arr, int i, int n){
        if(i>=n/2){
            return;
        }
        swap(arr[i],arr[n-i-1]);
        fun2(arr,i+1,n);
    }


    //swapping in same function
    static void reverseArrayByRecursion(int arr[], int start, int end){
        int t;
        if(start > end)
            return;
        else {
            t = arr[start];
            arr[start] = arr[end];
            arr[end] = t;
        }
        reverseArrayByRecursion(arr, start+1, end-1);
    }

    private static void swap(int i, int j) {
        int temp = i;
        i=j;
        j=temp;
    }

}
