package com.hussaincode.javaIntro.stacksAndqueuees;

import java.util.Stack;

public class InternalStack {
    public static void main(String[] args) throws StackException {
        Stack stc = new Stack();
        stc.push(10);
        stc.push(20);
        stc.push(30);
        stc.push(15);
        System.out.println(stc);
        stc.peek();


        System.out.println(stc.pop());
        System.out.println(stc.pop());
        System.out.println(stc.pop());
        System.out.println(stc.pop());
    }
}
