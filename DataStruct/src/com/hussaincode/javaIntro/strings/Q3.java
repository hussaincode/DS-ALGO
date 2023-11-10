package com.hussaincode.javaIntro.strings;

public class Q3 {
    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(interpret(command));
    }
    public static String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                sb.append("G");
            }
            else if(command.charAt(i)=='('){
                if(command.charAt(i+1)==')'){
                    sb.append("o");
                    i++; //so that it does not waste time on ")"
                }
                else{
                    sb.append("al");
                    i=i+3; // so that it does not waste time on "al)"
                }
            }
        }
        return sb.toString();
    }
}
