package com.hussaincode.javaIntro.IntermediateJavaProgram;

import java.util.Scanner;

// 2.Calculate Electricity Bill
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a total unit: ");
        int unit = sc.nextInt();
        double perUnitCharges=6.85;
        double electricityBill=perUnitCharges*unit;
        System.out.println("Your total Electricity bill is "+electricityBill);
    }
}
