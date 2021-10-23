package com.hussaincode.javaIntro.functions04;

import java.util.Scanner;

//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        System.out.println("max :"+max(num1,num2,num3));
        System.out.println("min :"+min(num1,num2,num3));
    }

    //Optimize logic
    static int max(int num1, int num2, int num3) {
       int max=num1;
       if(num2>max){
           max=num2;
       }
       if(num3>max){
           max=num3;
       }
       return max;
    }
    static int min(int num1, int num2, int num3) {
        int min=num1;
        if(num2<min){
            min=num2;
        }
        if(num3<min){
            min=num3;
        }
        return min;
    }
//    Simple logic
 /*   static int max(int num1, int num2, int num3) {
        if (num1>num2 && num1>num3){
            return  num1;
        }else if (num2>num1 && num2>num3){
            return  num2;
        }else{
            return num3;
        }
    }
    static int min(int num1, int num2, int num3) {
        if (num1 < num2 && num1 < num3) {
            return num1;
        } else if (num2 < num1 && num2 < num3) {
            return num2;
        } else {
            return num3;
        }*/
}
