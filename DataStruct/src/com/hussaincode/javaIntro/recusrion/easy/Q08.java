package com.hussaincode.javaIntro.recusrion.easy;

import java.util.Scanner;

//https://www.codechef.com/problems/FIBXOR01/?tab=statement
public class Q08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long n = scanner.nextLong();

            long result = calculateF(a, b, n);
            System.out.println(result);
        }
    }
   static long calculateF(long a, long b, long n){
        if(n==0){
            return a;
        }else if(n==1){
            return b;
        }
        return calculateF(a,b,n-1) ^ calculateF(a,b,n-2);
    }
}
