package com.hussaincode.javaIntro.recusrion.easy;

//https://leetcode.com/problems/power-of-four/description/
public class Q19 {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }
    public static boolean isPowerOfFour(int n) {
        if(n==0){
            return false;
        }
        if(n==1) return true;
        if(n%4==0) return isPowerOfFour(n/4);
        else return false;
    }
}
