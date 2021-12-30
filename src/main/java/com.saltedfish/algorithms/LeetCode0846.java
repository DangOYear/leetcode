package com.saltedfish.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author SaltedFish
 * @date 2021/12/30
 */
public class LeetCode0846 {
    class Solution {
        public boolean isNStraightHand(int[] hand, int groupSize) {
            int n = hand.length;
            if (n % groupSize != 0) {
                return false;
            }
            Arrays.sort(hand);
            Map<Integer, Integer> count = new HashMap<>();
            for (int x : hand) {
                count.put(x, count.getOrDefault(x, 0) + 1);
            }

            for (int x: hand) {
                if (!count.containsKey(x)) {
                    continue;
                }
                for (int i = 0; i < groupSize; i++) {
                    int num = x + i;
                    if (!count.containsKey(num)) {
                        return false;
                    }
                    count.put(num, count.get(num) - 1);
                    if (count.get(num) == 0) {
                        count.remove(num);
                    }
                }

            }
            return true;
        }
    }
}
