package com.hussaincode.javaIntro.recusrion.sorting;

import java.util.Arrays;

public class MergeSortEasy {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        //     mergeSortInPlace(arr, 0, arr.length);
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if(start==end) return;
        int mid = (start+end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[arr.length];
        int left = start;
        int right = mid+1;
        int k=0;
        while (left<=mid && right<=end){
            if(arr[left]<=arr[right]){
                temp[k]=arr[left];
                left++;
            }else {
                temp[k]=arr[right];
                right++;
            }
            k++;
        }
        while (left<=mid){
            temp[k]=arr[left];
            left++;
            k++;
        }
        while (right<=end){
            temp[k]=arr[right];
            right++;
            k++;
        }
        for (int i=start;i<=end;i++){
            arr[i]=temp[i-start];
        }
    }
}
