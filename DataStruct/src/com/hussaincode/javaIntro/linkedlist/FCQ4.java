package com.hussaincode.javaIntro.linkedlist;

public class FCQ4 {
    public static void getEmployeeId(){
        throw new Error();
    }

    public static void main(String [] args)  {
        try {
            getEmployeeId();
            System.out.print("A");
        }
        catch (Exception ex){
            System.out.print("B");
        }
        finally {
            System.out.print("C");
        }
        System.out.print("D");
    }
}
