package com.hussaincode.javaIntro.arrays05;
//Richest Customer Wealth
//https://leetcode.com/problems/richest-customer-wealth/submissions/
public class Q4 {
    public static void main(String[] args) {
        int[][] accounts={{1,5},
                          {7,3},
                          {3,5}};
        int ans=maximumWealth(accounts);
        System.out.println(ans);
        
    }

    static int max=Integer.MIN_VALUE;
    static int maximumWealth(int[][] accounts) {
        for (int person=0;person<accounts.length;person++){
             int sum=0;
            for (int account=0;account<accounts[person].length;account++){
                sum+=accounts[person][account];
            }
            if (sum>max){
                max=sum;
            }
        }
        return max;
    }
}
