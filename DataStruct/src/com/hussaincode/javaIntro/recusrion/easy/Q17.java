package com.hussaincode.javaIntro.recusrion.easy;

//https://leetcode.com/problems/power-of-two/description/
public class Q17 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
    public static boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
        if(n==1) return true;
        if(n%2==0) return isPowerOfTwo(n/2);
        else return false;
    }
}
