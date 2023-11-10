package com.hussaincode.javaIntro.searching06.easy;

//https://leetcode.com/problems/sqrtx/description/
public class Q1 {
    public static void main(String[] args) {
        int x =4;
        System.out.println(mySqrt(x));
    }
    public static int mySqrt(int x) {
        long start =1, end =x;
        long ans = 1;
        if(x==0 || x==1){
            return x;
        }
        while(start<=end){
            long mid = start+(end-start)/2;
            if(mid*mid<=x){
                ans = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return (int)ans;
    }

}
