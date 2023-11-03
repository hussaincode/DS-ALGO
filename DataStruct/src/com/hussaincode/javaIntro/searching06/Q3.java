package com.hussaincode.javaIntro.searching06;

//https://leetcode.com/problems/first-bad-version/
public class Q3 {
    public static void main(String[] args) {

    }
    public int firstBadVersion(int n) {
        int start =1, end =n;
        int ans = -1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(isBadVersion(mid)==true){
                ans = mid;
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }

    private boolean isBadVersion(int mid) {
    }
}
