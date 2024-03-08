package com.hussaincode.javaIntro;

import java.util.Scanner;

public class JavaIntro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int basicSal = sc.nextInt();
        char grade = sc.next().charAt(0);
        sc.close();

        int hra = basicSal * 20/100;
        int da = basicSal * 50/100;
        int pf = basicSal * 11/100;
        int allow;

        if(grade == 'A'){
            allow= 1700;
        }else if(grade == 'B'){
            allow = 1500;
        }else{
            allow = 1300;
        }

        int totalSal = (basicSal + hra + da + allow -pf);
        System.out.println(totalSal);
    }
}
