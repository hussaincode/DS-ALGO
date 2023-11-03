package com.hussaincode.javaIntro.searching06;

//https://leetcode.com/problems/valid-perfect-square/
public class Q5 {
    public static void main(String[] args) {
        int num=16;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        int start =1, end = num;
        while(start<=end){
            long mid = start+(end-start)/2;
            if(mid*mid==num){
                return true;
            }else if(mid*mid>num){
                end =(int) mid-1;
            }else{
                start=(int)mid+1;
            }
        }
        return false;
    }
}
