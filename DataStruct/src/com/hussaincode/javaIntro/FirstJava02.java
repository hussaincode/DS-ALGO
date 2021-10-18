package com.hussaincode.javaIntro;

import java.util.Scanner;

public class FirstJava02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//       1. Write a program to print whether a number is even or odd, also take input.
        /*System.out.print("Enter your number : ");
        int input = sc.nextInt();
        if(input%2==0){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }*/

//       2. Take name as input and print a greeting message for that name.
        /*String name = sc.next();
        System.out.println("Hey, Good Morning "+name);*/

//      3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        /*System.out.println("Enter time in years");
        float time = sc.nextFloat(); //in years
        System.out.println("Enter rate in %");
        long principal = sc.nextLong();
        System.out.println("Enter principal");
        float rate = sc.nextFloat();

        double simpleInterest = (principal*rate*time)/100;
        System.out.println("Simple Interest is "+ simpleInterest);*/

//     4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
       /* System.out.print("Enter first number");
        double num1=sc.nextDouble();
        System.out.print("Enter second num");
        double num2 = sc.nextDouble();
        System.out.print("Enter the operation you want to perform:(+,-,*,/) ");
        String operation =  sc.next();
        if(operation.equals("+")){
            System.out.println("Sum "+(num1+num2));
        }else if (operation.equals("-")){
            System.out.println("Subs "+(num1-num2));
        }else if (operation.equals("*")){
            System.out.println("Mul "+(num1*num2));
        }else if (operation.equals("/")){
            System.out.println("Div "+(num1/num2));
        }else {
            System.out.println("wrong operation");
        }*/

//     5. Take 2 numbers as input and print the largest number.
       /* System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        if (num1>num2){
            System.out.println(num1 + " is greater");
        }else{
            System.out.println(num2+" is greater");
        }*/

//     6. Input currency in rupees and output in USD.
/*
        System.out.print("Enter INR: ");
        double inr = sc.nextDouble();
        double usd = inr/75.35d;
        System.out.println(inr +" INR is "+usd+" USD");*/

//     7. To calculate Fibonacci Series up to n numbers.
           /* System.out.print("Enter the number: ");
            int num = sc.nextInt();
            int n1 = 0, n2 = 1, n3, i;

            System.out.print(n1 + " " + n2);//printing 0 and 1

            for (i = 2; i < num; ++i)//loop starts from 2 because 0 and 1 are already printed
            {
                n3 = n1 + n2;
                System.out.print(" " + n3);
                n1 = n2;
                n2 = n3;
            }*/

//       8. To find out whether the given String is Palindrome or not.
       /* System.out.print("Enter the String: ");
        String str=sc.next();
        String rev="";
        int length = str.length();

        for ( int i = length - 1; i >= 0; i-- )
            rev = rev + str.charAt(i);

        if (str.equals(rev))
            System.out.println(str+" is a palindrome");
        else
            System.out.println(str+" is not a palindrome");*/

//    9. To find Armstrong Number between two given number.
        System.out.print("Enter the number: ");
        int number=sc.nextInt();
        int temp=number;
        int r,sum=0;
        while (number>0) {
            r = number % 10;
            number = number / 10;
            sum = sum + (r * r * r);
        }
        if (sum==temp) {
            System.out.println(temp+" is pelindrom");
        }else{
            System.out.println(temp+" is not a pelindrome");
        }

        }
}
