package com.hussaincode.javaIntro.stacksAndqueuees.practice;

import java.util.Stack;
//https://leetcode.com/problems/valid-parentheses/description/
public class Paranthesis {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(balancedParanthesis(s));
    }
    public static boolean balancedParanthesis(String s){
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if (c == '('){
                stack.push(')');
            }else if (c == '{'){
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
