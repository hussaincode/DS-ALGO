package com.hussaincode.javaIntro.recusrion.subset;

import java.util.ArrayList;

public class NumberSeq {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {3,1,2};
        int n = arr.length;
        seq(0,list,arr,n);
    }
    static void seq(int index, ArrayList<Integer> list, int[] arr, int n){
        if (index==n){
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }
        list.add(arr[index]);
        seq(index+1,list,arr,n);
        list.remove(list.size()-1);
        seq(index+1,list,arr,n);
    }
}
