package com.hussaincode.javaIntro.searching06.practice;


// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

public class SamallestLetter {
    public static void main(String[] args) {
        char[] letters ={'c','d','f','j'};
        char target = 'j';
        System.out.println(nextGreatestCharacter(letters,target));
    }



    static char nextGreatestCharacter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            //find the middle elements
            // int mid = (start+end)/2 ; //might be possible that (start+end) exceeds the limit of integer
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start%letters.length];
    }
    
}
