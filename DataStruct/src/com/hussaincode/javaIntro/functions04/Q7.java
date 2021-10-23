package com.hussaincode.javaIntro.functions04;

import java.util.Scanner;

//Define a method to find out if a number is prime or not.
public class Q7 {
     static boolean prime=true;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
       if (prime(num)){
           System.out.println("Prime");
       }else
           System.out.println("Not prime");
    }
//Optimized method
    static boolean prime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
    //Simple method
    /* static void prime(int num) {
        if (num==0 || num==1){
            System.out.println("Not prime");
        }else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println("Not prime");
                    prime=false;
                    break;
                }
            }
            if (prime){
                System.out.println("Prime");
            }
        }
    }*/
}
