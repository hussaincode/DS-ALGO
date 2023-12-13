package com.hussaincode.javaIntro.recusrion.easy;

import java.util.Scanner;
//https://practice.geeksforgeeks.org/problems/geek-onacci-number/0
public class Q10 {
    public static void main (String[] args)
    {
        //code
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0;i<T;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(disp(a,b,c,n));

        }
    }
    static int disp(int a,int b,int c,int n){
        if(n == 1){
            return a;
        }
        if(n == 2){
            return b;
        }
        if(n == 3){
            return c;
        }
        else{
            return disp(a,b,c,n-1) + disp(a,b,c,n-2) + disp(a,b,c,n-3);
        }
    }
}
