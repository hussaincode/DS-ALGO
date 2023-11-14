package com.hussaincode.javaIntro.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

//https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
public class Q12 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        return Arrays.stream(s.split(" "))
                .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}
