package com.hussaincode.javaIntro.recusrion.easy;

//https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion/
public class Q09 {
    public static void main(String[] args) {
       String str = "leetcode";
        System.out.println(recLen(str));
    }
    private static int recLen(String str)
    {
        // if we reach at the end of the string
        if (str.isEmpty())
            return 0;
        else
            return recLen(str.substring(1)) + 1;
    }
}
