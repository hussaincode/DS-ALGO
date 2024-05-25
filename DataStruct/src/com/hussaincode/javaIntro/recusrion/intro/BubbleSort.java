package com.hussaincode.javaIntro.recusrion.intro;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,3,1,6,5};
        BS(arr, arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void BS(int[] arr, int r, int c){
        if (r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                //swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            BS(arr,r,c+1);
        }else {
            BS(arr, r-1, 0);
        }
    }
}
