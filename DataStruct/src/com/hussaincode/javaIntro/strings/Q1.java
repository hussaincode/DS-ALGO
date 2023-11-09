package com.hussaincode.javaIntro.strings;

//https://leetcode.com/problems/defanging-an-ip-address/description/
public class Q1 {
    public static void main(String[] args) {
        String str = "1.1.1.1";
        System.out.println(defangIPaddr(str));
    }
    public static String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}
