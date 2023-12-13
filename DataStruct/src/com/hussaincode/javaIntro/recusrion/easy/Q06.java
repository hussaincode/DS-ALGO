package com.hussaincode.javaIntro.recusrion.easy;

//https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1
public class Q06 {
    public static void main(String[] args) {
        printNos(10);
    }
    public static void printNos(int N)
    {
        if(N<1){
            return;
        }
        //Your code here
        printNos(N-1);
        System.out.print(N + " ");
    }

}
