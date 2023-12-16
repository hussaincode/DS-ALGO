package com.hussaincode.javaIntro.recusrion.easy;
////https://www.geeksforgeeks.org/sum-of-natural-numbers-using-recursion/
public class Q16 {
    public static void main(String[] args) {
        System.out.println(naturalSum(3));
    }
    static int naturalSum(int n){
        {
            if (n <= 1)
                return n;
            return n + naturalSum(n - 1);
        }

    }
}
