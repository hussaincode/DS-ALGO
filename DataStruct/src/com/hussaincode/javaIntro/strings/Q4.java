package com.hussaincode.javaIntro.strings;

import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/count-items-matching-a-rule/description/
public class Q4 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("phone","blue","pixel");
        List<String> list2 = Arrays.asList("computer","silver","lenovo");
        List<String> list3 = Arrays.asList("phone","gold","iphone");
        List<List<String>> items = Arrays.asList(list1,list2,list3);
        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(countMatches(items,ruleKey,ruleValue));

    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;

        switch(ruleKey){

            case "type"  :   for(int i=0; i<items.size(); i++ ){
                if(items.get(i).get(0).equals(ruleValue))
                    count++;
            }
                return count;

            case "color" :for(int i=0; i<items.size(); i++ ){
                if(items.get(i).get(1).equals(ruleValue) )
                    count++;
            }
                return count;

            case "name"  :    for(int i=0; i<items.size(); i++ ){
                if(items.get(i).get(2).equals(ruleValue))
                    count++;
            }
        }

        return count;
    }
}
