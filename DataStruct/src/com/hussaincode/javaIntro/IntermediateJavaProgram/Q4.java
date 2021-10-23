package com.hussaincode.javaIntro.IntermediateJavaProgram;

import java.util.Scanner;

// 4.Calculate Discount Of Product
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of the product: ");
        int price=sc.nextInt();
        System.out.println("Enter the discount %");
        int discPercent=sc.nextInt();
        double discount = (discPercent*price)/100;
        System.out.println("Discount on the product is "+discount);
    }
}
