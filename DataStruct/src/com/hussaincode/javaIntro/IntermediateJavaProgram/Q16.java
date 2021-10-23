package com.hussaincode.javaIntro.IntermediateJavaProgram;

import java.util.Scanner;

//Find Ncr & Npr
public class Q16 {
    static double fact(double n)
    {
        double f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        System.out.println("Enter value of r");
        int r=sc.nextInt();
        if(n>=r)
        {
            double com=fact(n)/(fact(n-r)*fact(r));
            double per=fact(n)/fact(n-r);
            System.out.println("The value of "+n+"p"+r+" is : "+per);
            System.out.println("The value of "+n+"c"+r+" is : "+com);
        }
        else
            System.out.println("Please enter n>=r");
    }
}
