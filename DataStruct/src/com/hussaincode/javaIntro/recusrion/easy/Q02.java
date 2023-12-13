package com.hussaincode.javaIntro.recusrion.easy;

public class Q02 {
    public static void main(String[] args) {
        int[] A = {1, 4, 45, 6, -50, 10, 2};
        int n = A.length;

        // Function calling
        System.out.println(findMinRec(A, n));
        System.out.println(findMaxRec(A,n));
    }
    public static int findMinRec(int[] A, int n)
    {
        // if size = 0 means whole array
        // has been traversed
        if(n == 1)
            return A[0];

        return Math.min(A[n-1], findMinRec(A, n-1));
    }

    public static int findMaxRec(int[] A, int n)
    {
        // if size = 0 means whole array
        // has been traversed
        if(n == 1)
            return A[0];

        return Math.max(A[n-1], findMaxRec(A, n-1));
    }
}
