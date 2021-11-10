package com.hussaincode.javaIntro.arrays05;
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/submissions/
public class Q10 {
    public static void main(String[] args) {
        String sentence="leetcode";
        System.out.println(checkIfPangram(sentence));
    }
    static boolean checkIfPangram(String sentence) {
            for (int i=0;i<sentence.length();i++){
                if(sentence.indexOf(sentence.charAt(i)) == -1)
                    return false;
            }
        return true;
    }
}
