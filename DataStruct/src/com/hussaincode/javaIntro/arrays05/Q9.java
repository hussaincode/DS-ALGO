package com.hussaincode.javaIntro.arrays05;

import java.util.ArrayList;
import java.util.Arrays;

public class Q9 {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    static int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> al = new ArrayList<>();
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            al.add(index[i], nums[i]);
        }
        for( int i = 0; i < nums.length; i++){
            result[i] = al.get(i);
        }
        return result;
    }
}
