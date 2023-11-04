package com.hussaincode.javaIntro.searching06;

//https://leetcode.com/problems/arranging-coins/
public class Q6 {
    public static void main(String[] args) {
        int n =5;
        System.out.println(arrangeCoins(n));
    }
    public static int arrangeCoins(int n) {
        long start =1,end=n;
        long res=0;
        while(start<=end){
            long mid = start+(end-start)/2;
            long coins = (mid)*(mid+1)/2;
            if(coins>n){
                end = mid-1;
            }else{
                start=mid+1;
                res = Math.max(mid,res);
            }
        }
        return (int)res;
    }
}
