package com.hussaincode.javaIntro.stacksAndqueuees;

import java.util.LinkedList;
import java.util.Queue;

public class InternalQueuee {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(6);
        queue.add(8);
        queue.add(5);
        queue.add(9);
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
