package com.hussaincode.javaIntro.strings;

//https://leetcode.com/problems/to-lower-case/description/
public class Q7 {
    public static void main(String[] args) {
       String s = "Hello";
        System.out.println(toLowerCase(s));
    }
    public static String toLowerCase(String s) {
       /* for(int i=0;i<=s.length()/2;i++)
        {
            if(s.charAt(i)+0>=65&&s.charAt(i)+0<=90)
            {
                s+=(char)(s.charAt(i)+32);
            }
            else
            {
                s+=s.charAt(i);
            }
        }
        return s.substring(s.length()/2,s.length()-1);*/
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90)
                sb.append((char)(s.charAt(i)+32));
            else sb.append(s.charAt(i));
        }
        return sb.toString();

    }

}
