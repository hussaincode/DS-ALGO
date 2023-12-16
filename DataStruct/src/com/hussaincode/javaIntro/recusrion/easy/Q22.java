package com.hussaincode.javaIntro.recusrion.easy;
//https://www.geeksforgeeks.org/program-check-array-sorted-not-iterative-recursive/
public class Q22 {
    public static void main(String[] args) {
        int[] arr ={25, 21, 45, 89, 89, 90};
        int n = arr.length-1;
        System.out.println(sorted(arr,n));
    }
    private static boolean sorted(int[] arr, int n) {
        if(n<=0){
            return true;
        }
        if (arr[n] >= arr[n-1]) {
           return sorted(arr, n - 1);
        }
        return false;
    }

}
