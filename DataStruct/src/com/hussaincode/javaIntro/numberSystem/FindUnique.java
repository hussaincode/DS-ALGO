package com.hussaincode.javaIntro.numberSystem;

public class FindUnique {
    public static void main(String[] args) {
    int[] arr = {2,3,3,3,4,2,4,2,6,4};
        System.out.println(ans2(arr));
    }

    private static int ans(int[] arr) {
        int unique=0;
        for(int n : arr){
            unique^=n;
        }
        return unique;
    }
    private static int ans2(int[] arr) {
        int num=0,ans=0;
        for(int n : arr){
          num = n%3;
            if(num==1)
                ans=arr[n];
        }
        return ans;
    }

}
