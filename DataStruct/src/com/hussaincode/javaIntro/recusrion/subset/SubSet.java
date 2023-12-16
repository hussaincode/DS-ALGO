package com.hussaincode.javaIntro.recusrion.subset;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        recursion(nums, ans, cur,0);
        return ans;
    }
   static void recursion(int[] nums, List<List<Integer>> ans, List<Integer> cur,int ind){
        if(ind>=nums.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
            cur.add(nums[ind]);
            recursion(nums, ans, cur, ind+1);
            cur.remove(cur.size()-1);
            recursion(nums,ans,cur,ind+1);

    }
}
