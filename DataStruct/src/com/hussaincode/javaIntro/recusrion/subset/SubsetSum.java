package com.hussaincode.javaIntro.recusrion.subset;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));
    }
    public static List<Integer> subsets(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        int sum =0;
        recursion(nums, ans,0,sum);
        return ans;
    }
    static void recursion(int[] nums, List<Integer> ans, int ind, int sum){
        if(ind>=nums.length) {
            ans.add(sum);
            return;

        }
            recursion(nums, ans, ind + 1, sum + nums[ind]);
            recursion(nums, ans, ind + 1, sum);
    }
}
