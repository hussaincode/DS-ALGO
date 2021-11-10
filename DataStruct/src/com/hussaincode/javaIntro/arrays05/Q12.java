package com.hussaincode.javaIntro.arrays05;
//https://leetcode.com/problems/find-the-highest-altitude/submissions/
public class Q12 {
    public static void main(String[] args) {
        int[] gain={28,0,-8,-99,11,62,-35,68,2,12,-71,13,66,-28};
        System.out.println(largestAltitude(gain));
    }
    static int largestAltitude(int[] gain) {
        int sum[] = new int[gain.length+1];
        sum[0]=0;
        int max = sum[0];
        for(int i=0;i<gain.length;i++){
            sum[i+1]=sum[i]+gain[i];
        }
        for(int j=0;j<sum.length;j++){
            if (sum[j] > max){
                max = sum[j];
            }
        }
        return max;

    }
}
