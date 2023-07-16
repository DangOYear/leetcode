package com.saltedfish.algorithms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class LeetCode1046 {
    class Solution {
        public int lastStoneWeight(int[] stones) {

            if (stones.length == 0)
                return 0;

            if (stones.length == 1)
                return stones[0];

            PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });
            for (int x:stones) {
                queue.offer(x);
            }
            while (queue.size() > 1) {
                int num1 = queue.poll();
                int num2 = queue.poll();
                if (num1 == num2)
                    continue;
                else {
                    queue.offer(num1-num2);
                }
            }

            return queue.size() == 1 ? queue.peek():0;
        }
    }
}
