package com.hussaincode.javaIntro.strings;

//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
public class Q6 {
    public static void main(String[] args) {
       String[]  word1 = {"ab", "c"};
       String[] word2 =  {"ac", "c"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String sb1="";
        String sb2="";
        for (String s1 : word1) {
            sb1+=s1;
        }
        for (String s2 : word2) {
            sb2+=s2;
        }
        return sb1.equals(sb2);
    }
}
