package com.hussaincode.javaIntro.strings;

//https://leetcode.com/problems/excel-sheet-column-title/description/
public class Q13 {

    public static void main(String[] args) {
        int columnNumber = 26;
        System.out.println(convertToTitle(columnNumber));
    }

     public static StringBuilder rec = new StringBuilder();
    public static String convertToTitle(int columnNumber) {

        // if less than 26, find without recursion
        if(columnNumber <= 26){
            char s = (char) (columnNumber - 1 + 'A');
            return s+"";
        }else{
            recursive(columnNumber); // else find using recursion
            return rec.toString();
        }


    }

    public static void recursive(int num){
        if(num <= 26){
            char s = (char) (num - 1 + 'A');
            rec.append(s+"");
            return ;
        }
        recursive((num-1)/26);
        if(num%26 == 0){
            rec.append("Z");
        }else{
            char s2 = (char) ((num%26 -1) + 'A') ;
            rec.append(s2+"");
        }
    }
}
