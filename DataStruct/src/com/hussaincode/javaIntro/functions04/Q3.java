package com.hussaincode.javaIntro.functions04;

import java.util.Scanner;

//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the age of a person: ");
        int age=sc.nextInt();
        vote(age);
    }

     static void vote(int age) {
        if (age>=18){
            System.out.println("person can vote");
        }else
            System.out.println("person can not vote");
    }
}
