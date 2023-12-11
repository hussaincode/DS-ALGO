package com.hussaincode.javaIntro.recusrion.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        insertion(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr, int first, int last){
        if(last==0){
            return;
        }
        if(last>first){
            if(arr[first]!=1){
                int temp=arr[first];
                arr[first] = arr[arr[first]-1];
                arr[arr[first]-1] = temp;
            }
            insertion(arr,0,last-1);
        }
    }
}
