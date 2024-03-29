package com.hussaincode.javaIntro.strings;

//https://leetcode.com/problems/determine-if-string-halves-are-alike/description/
public class Q8 {
    public static void main(String[] args) {
        String s = "Book";
        System.out.println(halvesAreAlike(s));
    }
    public static boolean halvesAreAlike(String s) {
        int vowelCount=0;
        char[] chArray = s.toCharArray();

        for(int i=0; i<chArray.length/2; i++)
            if(isVowel(chArray[i])) vowelCount++;
        for(int i=chArray.length/2; i<chArray.length; i++)
            if(isVowel(chArray[i])) vowelCount--;

        return vowelCount==0;
    }

    public static boolean isVowel(char ch)
    {
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U';
    }
}
