package com.hussaincode.javaIntro.IntermediateJavaProgram;

import java.util.Scanner;

//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int num;
        int sumofNeg=0;
        int sumOfPosEven=0;
        int sumOfOdd=0;
      while ((num = sc.nextInt()) != 0) {
          if (num < 0) {
              sumofNeg += num;
          } else if (num > 0 && num % 2 == 0) {
              sumOfPosEven += num;
          } else {
              sumOfOdd += num;
          }
      }
        System.out.println("sum of all -ve num "+ sumofNeg);
        System.out.println("sum of all +ve even num "+sumOfPosEven);
        System.out.println("sum of all odd num "+sumOfOdd);

    }
}
