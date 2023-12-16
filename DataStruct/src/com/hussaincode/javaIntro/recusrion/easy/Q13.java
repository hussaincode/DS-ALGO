package com.hussaincode.javaIntro.recusrion.easy;

public class Q13 {
    public static void main(String[] args) {
        int n =12345;
        System.out.println(sum_of_digit(n));
    }
    static int sum_of_digit(int n)
    {
        if (n == 0)
            return 0;
        return (n % 10 + sum_of_digit(n / 10));
    }
}
