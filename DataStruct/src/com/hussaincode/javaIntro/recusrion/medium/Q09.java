package com.hussaincode.javaIntro.recusrion.medium;

public class Q09 {
    public static void main(String[] args) {
        System.out.println( count(4));
    }
    static int count(int N)
    {
        // code here
        return catalan(N/2);
    }
    static int catalan(int n)
    {
        // Base case
        if (n <= 1)
            return 1;

        // catalan(n) is sum of
        // catalan(i)*catalan(n-i-1)
        int res = 0;
        for (int i = 0; i < n; i++)
            res += catalan(i)
                    * catalan(n - i - 1);

        return res;
    }
}
