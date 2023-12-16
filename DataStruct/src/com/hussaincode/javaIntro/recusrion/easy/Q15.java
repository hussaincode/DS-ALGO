package com.hussaincode.javaIntro.recusrion.easy;

public class Q15 {
    public static void main(String[] args) {
        System.out.println(isPrime(15,2));
    }
    static boolean isPrime(int n, int i)
    {

        // Base cases
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        // Check for next divisor
        return isPrime(n, i + 1);
    }

    public static class Q16 {
    }
}
