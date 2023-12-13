package com.hussaincode.javaIntro.recusrion.easy;

//https://leetcode.com/problems/binary-search/description/
public class Q3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 5;
        System.out.println(search(arr,target,0,arr.length-1));

    }
    public static int search(int[] numbs, int target,int s, int e) {
            int m = s+(e-s)/2;
            if(s>e){
                return -1;
            }
            if(numbs[m]==target){
                return m;
            }else if(numbs[m]>target){
               return search(numbs,target,s,m-1);
            }else{
               return search(numbs,target,s+1,e);
            }
        }
}
