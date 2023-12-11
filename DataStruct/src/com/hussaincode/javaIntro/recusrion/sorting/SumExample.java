package com.hussaincode.javaIntro.recusrion.sorting;

import java.util.stream.IntStream;

public class SumExample {
    public static void main(String[] args) {
        int sum = IntStream.range(0, 50)
                .sum();

        System.out.println("Sum: " + sum);
    }
}
