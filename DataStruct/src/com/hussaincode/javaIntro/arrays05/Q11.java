package com.hussaincode.javaIntro.arrays05;

import java.util.List;

public class Q11 {
    public static void main(String[] args) {

        //https://leetcode.com/problems/count-items-matching-a-rule/description/
    }
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
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
                return count;
        }

        return count;
    }
}
