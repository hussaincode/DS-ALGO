package com.hussaincode.javaIntro.numberSystem;

import java.util.Arrays;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b=7;
        System.out.println(Arrays.toString(swapping(a, b)));
    }
    static int[] swapping(int a, int b){
        a=a^b;
        b=a^b;
        a=a^b;
        return new int[]{a,b};
    }
}
