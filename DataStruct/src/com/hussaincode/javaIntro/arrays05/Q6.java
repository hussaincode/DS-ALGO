package com.hussaincode.javaIntro.arrays05;
import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/
public class Q6 {
    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};
        int extraCandies=3;
        System.out.println(kidsWithCandies(candies,extraCandies));

    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> bool=new ArrayList<>(candies.length);
        int greatestcandy =0;
        for (int i=0;i<candies.length;i++) {
            if (candies[i] > greatestcandy)
                greatestcandy = candies[i];
        }
        for (int i=0;i<candies.length;i++) {
            int extraAdded = candies[i] + extraCandies;
            if(extraAdded>=greatestcandy)
                bool.add(true);
            else
                bool.add(false);
        }
        return bool;
    }
}
