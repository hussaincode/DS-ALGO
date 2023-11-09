package com.hussaincode.javaIntro.strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));

        System.out.println("a"+1);  // this is same step as after a few steps : "a"+"1"
        //integer will be converted to Integer that will call toString()


        System.out.println("Hussain" + new ArrayList<>());
        System.out.println("Hussain" + 56);

        System.out.println(56 + " " + new ArrayList<>());
    }
}
