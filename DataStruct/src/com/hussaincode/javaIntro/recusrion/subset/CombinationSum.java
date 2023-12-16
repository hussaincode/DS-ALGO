package com.hussaincode.javaIntro.recusrion.subset;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/combination-sum/description/
public class CombinationSum {
    public static void main(String[] args) {
       int[] candidates = {2,3,6,7};
       int target = 7;
        List<List<Integer>> ans = combinationSum(candidates, target);

        System.out.println(ans);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        backtrack(candidates, target, ans, cur, 0);
        return ans;
    }

    public static void backtrack(int[] candidates, int target, List<List<Integer>> ans, List<Integer> cur, int index) {
        if (target == 0) {
            ans.add(new ArrayList<>(cur));
        }
        else if (target < 0 || index >= candidates.length) return;
        else {
            cur.add(candidates[index]);
            backtrack(candidates, target - candidates[index], ans, cur, index);

            cur.remove(cur.size() - 1);
            backtrack(candidates, target, ans, cur, index + 1);
        }
    }
}
