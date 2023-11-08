package com.hussaincode.javaIntro.sorting.bubblesort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr =  {4,1,3,9,7};
        bubble(arr);

        System.out.println(Arrays.toString(arr));
    }


     static void bubble(int[] arr)
    {
        int n = arr.length;
        boolean swapped;
        //code here
        for(int i=0;i<n;i++){
            swapped = false;
            for(int j=1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp =arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped =true;
                }
            }
            if(!swapped)
                break;

        }
    }
}
