package com.hussaincode.javaIntro.recusrion.easy;

//https://www.geeksforgeeks.org/remove-consecutive-duplicates-string/
public class Q25 {
    public static void main(String[] args) {
        String str = "aaaaabbbbbb";
        System.out.println(printUniques(str));
    }

    private static String printUniques(String str) {
        if (str.length() <= 1)
            return str;
        if (str.charAt(0) == str.charAt(1))
            return printUniques(str.substring(1));
        else
            return str.charAt(0) + printUniques(str.substring(1));
    }
}
