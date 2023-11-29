package com.hussaincode.javaIntro.recusrion.easy;

public class Nto1 {
    public static void main(String[] args) {
        int n =5;
        concept(n);
    }

    private static void fun(int n) {
        if(n<1){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }

    private static void fun2(int n) {
        if(n<1){
            return;
        }
        fun(n-1);
        System.out.println(n);
    }

    private static void funBoth(int n) {
        if(n<1){
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }

    static void concept(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
//        concept(n--);
        concept(--n);
//        n-- vs --n
    }

}
