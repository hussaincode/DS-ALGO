package com.hussaincode.javaIntro.IntermediateJavaProgram;

import java.util.Scanner;

//Java Program Vowel Or Consonant
public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter alphabet");
        char ch = sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'  )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }
}
