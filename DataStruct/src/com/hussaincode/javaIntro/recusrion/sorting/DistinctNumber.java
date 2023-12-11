package com.hussaincode.javaIntro.recusrion.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctNumber {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 4);

        // Use Java 8 Stream API to filter distinct numbers
        List<Integer> distinctNumbers = nums.stream()
                .distinct()
                .collect(Collectors.toList());

        // Print the distinct numbers
        System.out.println("Distinct Numbers: " + distinctNumbers);
    }
}
