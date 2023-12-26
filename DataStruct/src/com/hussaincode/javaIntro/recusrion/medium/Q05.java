package com.hussaincode.javaIntro.recusrion.medium;
//https://leetcode.com/problems/k-th-symbol-in-grammar/description/
public class Q05 {
    public static void main(String[] args) {
        System.out.println(kthGrammar(5,1));
    }
    public static int kthGrammar(int n, int k) {
        if( n == 1) return 0;
        int x = (int) Math.pow(2,n-2);
        if(k>x) return 1^kthGrammar(n-1,k-x);
        return kthGrammar(n-1,k);
    }
}
