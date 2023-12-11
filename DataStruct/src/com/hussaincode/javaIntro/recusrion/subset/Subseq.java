package com.hussaincode.javaIntro.recusrion.subset;

import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
       subseq("","abc");
       // System.out.println(subseq2("","abc"));
       // subseqASCII("","abc");
     //   System.out.println(subseqASCIIRet("","abc"));
    }
    static void subseq(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }

    static ArrayList<String> subseq2(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
       ArrayList<String> left = subseq2(p+ch,up.substring(1));
       ArrayList<String> right =subseq2(p,up.substring(1));
       left.addAll(right);
       return left;
    }

    static void subseqASCII(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqASCII(p+ch,up.substring(1));
        subseqASCII(p,up.substring(1));
        subseqASCII(p+(ch+0),up.substring(1));
    }

    static ArrayList<String> subseqASCIIRet(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseqASCIIRet(p+ch,up.substring(1));
        ArrayList<String> second = subseqASCIIRet(p,up.substring(1));
        ArrayList<String> third = subseqASCIIRet(p+(ch+0),up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }

}
