package com.hussaincode.javaIntro.recusrion.medium;

import java.util.ArrayList;
import java.util.List;

public class Q01 {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        List<List<Integer>> sum = combinationSum(candidates,target);
        System.out.println(sum);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findComb(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
    static void findComb(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds){
        if(ind==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[ind]<=target){
            ds.add(arr[ind]);
            findComb(ind, arr,target-arr[ind], ans, ds); //pick the element
            ds.remove(ds.size()-1);
        }
        findComb(ind+1, arr,target, ans, ds);    // do not pick the element
    }
}
