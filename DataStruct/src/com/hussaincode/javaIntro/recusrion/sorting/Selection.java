package com.hussaincode.javaIntro.recusrion.sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selectionSort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr, int last, int first, int max){
        if(last==0){
            return;
        }
        if(first<last){
            if(arr[first]>arr[max]){
                selectionSort(arr,last,first+1,first);

            }else {
                selectionSort(arr, last, first + 1,max);
            }
        }else {
            int temp = arr[max];
            arr[max] = arr[last-1];
            arr[last-1] = temp;
            selectionSort(arr, last-1, 0,0);
        }
    }
}
