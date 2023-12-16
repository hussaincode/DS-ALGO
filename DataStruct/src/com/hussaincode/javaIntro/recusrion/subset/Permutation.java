package com.hussaincode.javaIntro.recusrion.subset;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int[] nums ={1,2,3};
        System.out.println(perm(nums));
    }
    static List<List<Integer>> perm(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] fre = new boolean[nums.length];
        recurPerm(nums,ds, ans,fre);
        return ans;
    }

    private static void recurPerm(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] fre) {
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i=0;i<nums.length;i++){
            if (!fre[i]){
                fre[i]=true;
                ds.add(nums[i]);
                recurPerm(nums,ds,ans,fre);
                ds.remove(ds.size()-1);
                fre[i]=false;
            }
        }
    }
}
