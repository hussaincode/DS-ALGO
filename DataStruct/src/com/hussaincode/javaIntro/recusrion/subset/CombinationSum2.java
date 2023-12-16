package com.hussaincode.javaIntro.recusrion.subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {
        int[] candidates = {1,1,1,2,2};
        int target = 4;
        List<List<Integer>> ans = combinationSum2(candidates, target);

        System.out.println(ans);
    }

    private static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0,candidates, target, ans, new ArrayList<>());
        return ans;
    }

    private static void backtrack(int ind,int[] candidates, int target, List<List<Integer>> ans, List<Integer> cur) {
        if(target==0){
            ans.add(new ArrayList<>(cur));
            return;
        }
        for(int i = ind; i<candidates.length;i++){
            if(i>ind && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) break;
            cur.add(candidates[i]);
            backtrack(i+1,candidates,target-candidates[i],ans,cur);
            cur.remove(cur.size()-1);
        }
    }
}
