package com.hussaincode.javaIntro.IntermediateJavaProgram;

import java.util.Scanner;

//Reverse A string In Java
public class Q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        int length=str.length();
        String reverse="";
        for (int i=length-1;i>=0;i--){
          reverse+=str.charAt(i);
        }
        System.out.println(reverse);
    }

}
