package com.hussaincode.javaIntro.searching06;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class Q7 {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letters,target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length-1;
        char ans = letters[0];
        while(start<=end){
            int mid = start + (end-start)/2;
            if(letters[mid]>target){
                ans = letters[mid];
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
}
