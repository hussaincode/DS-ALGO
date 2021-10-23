package com.hussaincode.javaIntro.IntermediateJavaProgram;

import java.util.Scanner;

//Future Investment Value
public class Q19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        future value = present value x [1 + (interest rate x time)]
        System.out.println("Enter the present value");
        long pValue=sc.nextLong();
        System.out.println("Enter the rate of interest");
        double intRate=sc.nextDouble();
        System.out.println("Enter the time");
        double time=sc.nextDouble();  //in years
        double fValue=pValue*(1+(intRate*time));
        System.out.println("Future investment value : "+fValue);
    }
}
