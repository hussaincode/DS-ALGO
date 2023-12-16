package com.hussaincode.javaIntro.recusrion.easy;

import java.util.ArrayList;

//https://www.geeksforgeeks.org/powet-set-lexicographic-order/
public class Q27 {
    public static void main(String[] args) {
        set("","abc");
        System.out.println(set2("","abc"));
    }

    private static void set(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        set(p+up.charAt(0),up.substring(1));
        set(p,up.substring(1));
    }

    private static ArrayList<String> set2(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> left = set2(p+up.charAt(0),up.substring(1));
        ArrayList<String> right = set2(p,up.substring(1));
        left.addAll(right);
        return left;
    }

}
