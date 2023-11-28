package com.hussaincode.javaIntro.numberSystem;

public class RangeXOR {
    public static void main(String[] args) {
        int a=3,b=9;
        int ans = xor(b)^xor(a-1);
        System.out.println(ans);

        //only for check, will give TLE for large numbers.
        int ans2=0;
        for (int i=a;i<=b;i++){
            ans2^=i;
        }
        System.out.println(ans2);
    }

    private static int xor(int a) {
        if(a%4==0){
            return a;
        }
        if(a%4==1){
            return 1;
        }
        return 0;
    }
}
