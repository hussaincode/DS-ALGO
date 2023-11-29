package com.hussaincode.javaIntro.recusrion.easy;

public class DigitProducts {
    public static void main(String[] args) {
        int ans = prod(1342);
        System.out.println(ans);
    }

    static int prod(int n) {
        if (n%10 == n) {   //if we give n==0 and return 0 as digit addition then it will multiply all the digit with 0 and gives the final ans as always zero.
            return n;
        }
        return (n%10) * prod(n/10);
    }
}
