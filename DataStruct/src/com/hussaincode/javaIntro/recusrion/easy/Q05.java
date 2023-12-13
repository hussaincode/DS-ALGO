package com.hussaincode.javaIntro.recusrion.easy;

//https://leetcode.com/problems/reverse-string/
public class Q05 {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);
    }

    public static void reverseString(char[] s) {
        helper(s, 0, s.length-1);
    }
    static void helper(char[] s, int i, int j){
        if(i>=j){
            return;
        }
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        helper(s,i+1, j-1);
    }
}
