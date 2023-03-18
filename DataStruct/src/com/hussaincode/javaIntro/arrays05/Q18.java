package com.hussaincode.javaIntro.arrays05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/add-to-array-form-of-integer/submissions/
public class Q18 {
    public static void main(String[] args) {
        int[] num={2,3,2};
        int k=8947;
        System.out.println(addToArrayForm(num,k));
    }

    static List<Integer> addToArrayForm(int[] num, int k) {
        // Create A List
        List<Integer> list = new ArrayList<>();
        // Start from Last index of num Array
        /*
                          INDEX -> 0 1 2
        Explanation: let  num --> [2,3,2]
                          k   -->  8947
                     ADD num[LAST INDEX] + k  --> 2 + 8947 =  8949 --> k'   ADD(9) to LIST
                     Now ADD num[1] + (k' % 10) --> 3 + 894 = 897   --> k'   ADD(7) to LIST
                     Now ADD num[0] + (k' % 10) --> 2 + 89 = 91     --> k'   ADD(1) to LIST
                      k = k' % 10 = 9
                     At the End of the loop k != 0    So
                     Now ADD DIGITS of k to list FROM the END     --> ADD(9) to List
                     Now k is 0 so END while Loop

       At this point we have List as --> [9,7,1,9]  --> **Here NOTE that it is the REQUIRED ANS BUT **
	   IN REVERSE ORDER
                     --> So, now REVERSE the LIST
                     --> At the END return the Required List
         */
        for(int i=num.length-1 ; i>=0;i--) {
            int sum = num[i] + k;
            list.add(sum % 10);
            k = sum/ 10;
        }
        // if After Adding k in the Number  k is not ZERO then do this
        while(k > 0){
            list.add(k%10);
            k /= 10;
        }
        // Now Reverse the LIST
        Collections.reverse(list);
        // AT the end Return the list
        return list;
    }
    /*  public List<Integer> addToArrayForm(int[] num, int k) {
        long sum=0;
        string digit="";
        for(int i=0;i<num.length;i++){
            digit+=num[i];
        }
        long digitInt=Long.parseLong(digit);
        sum=digitInt+k;
        List<Long> list=new ArrayList<Long>();
        List<Long> newList=new ArrayList<Long>();
         while(sum>0){
            list.add(sum%10);
            sum/=10;
        }
        for(int i=list.size()-1;i>=0;i--){
            long newNum=list.get(i);
            newList.add(newNum);
        }

        return newList.stream().mapToInt(Long::intValue).boxed().collect(Collectors.toList());
    }*/
}
