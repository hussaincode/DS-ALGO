package com.hussaincode.javaIntro.functions04;

import java.util.Scanner;

//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
public class Q8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your marks: ");
        double marks=sc.nextDouble();
        grade(marks);

    }

     static void grade(double marks) {
        if (marks>=91 && marks<=100){
            System.out.println("Grade is AA");
        }else if (marks>=81 && marks<=90){
            System.out.println("Grade is AB");
        }else if (marks>=71 && marks<=80){
            System.out.println("Grade is BB");
        }else if (marks>=61 && marks<=70){
            System.out.println("Grade is BC");
        }else if (marks>=51 && marks<=60){
            System.out.println("Grade is CD");
        }else if (marks>=41 && marks<=50){
            System.out.println("Grade is DD");
        }else if (marks<=40){
            System.out.println("Fail");
        }

    }
 /*   Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail*/


}
