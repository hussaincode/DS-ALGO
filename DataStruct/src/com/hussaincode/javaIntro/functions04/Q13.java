package com.hussaincode.javaIntro.functions04;

import java.util.Scanner;

//Write a function that returns all prime numbers between two given numbers.
public class Q13 {
    static  int i, j, flag;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of number: ");
        int start=sc.nextInt();
        int end=sc.nextInt();
        System.out.printf("\nPrime numbers between %d and %d are: ", start, end);
        isPrime(start,end);
    }

     static void isPrime(int start, int end) {
         for (i = start; i <= end; i++) {

             // Skip 0 and 1 as they are
             // neither prime nor composite
             if (i == 1 || i == 0)
                 continue;

             // flag variable to tell
             // if i is prime or not
             flag = 1;

             for (j = 2; j <= i / 2; ++j) {
                 if (i % j == 0) {
                     flag = 0;
                     break;
                 }
             }
             // flag = 1 means i is prime
             // and flag = 0 means i is not prime
             if (flag == 1)
                 System.out.println(i);
         }
    }
}
