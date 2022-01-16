package com.saltedfish.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author SaltedFish
 * @date 2022/1/16
 */
public class LeetCode5983 {
    class Solution {

        public long maxRunTime(int n, int[] batteries) {
            ArrayList<Long> b = new ArrayList<Long>();
            int sum = 0;
            for (int x : batteries) {
                sum += x;
                b.add((long)x);
            }
            Collections.sort(b, Collections.reverseOrder());
            for (long x : b) {
                if (x > sum / n) {
                    n--;
                    sum -= x;
                } else {
                    break;
                }

            }
            return sum / n;
        }
    }

    public static void main(String[] args) {
        LeetCode5983.Solution solution = new LeetCode5983().new Solution();
        int[] b = new int[]{11,89,16,32,70,67,35,35,31,24,41,29,6,53,78,83};
        int n = 12;
        System.out.println(solution.maxRunTime(n, b));
    }
}
