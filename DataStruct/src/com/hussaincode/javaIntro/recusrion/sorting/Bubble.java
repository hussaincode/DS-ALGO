package com.hussaincode.javaIntro.recusrion.sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubbleSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr, int last, int first){
        if(last==0){
            return;
        }
        if(first<last){
            if(arr[first]>arr[first+1]){
                int temp = arr[first];
                arr[first] = arr[first+1];
                arr[first+1] = temp;

            }
            bubbleSort(arr,last,first+1);
        }else {
            bubbleSort(arr, last-1, 0);
        }
    }
}
