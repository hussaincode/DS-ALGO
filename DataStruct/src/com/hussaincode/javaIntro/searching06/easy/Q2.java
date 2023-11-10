package com.hussaincode.javaIntro.searching06.easy;

//https://leetcode.com/problems/guess-number-higher-or-lower/description/
public class Q2 {
    public static void main(String[] args) {
        int n=10;
        System.out.println(guessNumber(n));
    }
    public static int guessNumber(int n) {
        int start =1, end =n;
        while(start<=end){
            int mid = start+(end-start)/2;
            int pick = guess(mid);
            if(pick==-1){
                end=mid-1;
            }else if(pick == 1){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    private static int guess(int num) {
        int pick =6;
        if(num>pick){
            return -1;
        }else if(num<pick){
            return 1;
        }else{
            return 0;
        }
    }
}
