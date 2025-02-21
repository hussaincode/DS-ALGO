package com.hussaincode.javaIntro.recusrion.easy;

public class Q14 {
    public static void main(String[] args) {
        int a = 5, b = 4;

        int c = prod(a,b);
        System.out.println(c);
    }

    private static int prod(int a, int b) {
        if(b==1) return a;
        return  a+prod(a,b-1);
    }
}
