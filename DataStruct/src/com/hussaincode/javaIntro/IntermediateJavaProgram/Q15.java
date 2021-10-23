package com.hussaincode.javaIntro.IntermediateJavaProgram;

import java.util.Scanner;

//Armstrong Number In Java
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int temp=num;
        int lastDigit=0;
        int arms=0;
        while(num>0){
            lastDigit=num%10;
             arms+=(lastDigit*lastDigit*lastDigit);
            num=num/10;
        }
        if(temp==arms){
            System.out.println("Armstrong");
        }else {
            System.out.println("Not Armstrong");
        }
    }
}
