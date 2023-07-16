package com.saltedfish.algorithms;


import java.util.*;

public class LeetCode6254 {
    class Solution {
        public long dividePlayers(int[] skill) {
            int len = skill.length;
            int group = len / 2;
            int sum = 0;
            long res = 0;
            Map<Integer, Integer> numMap = new HashMap<>();
            for (int x : skill) {
                sum += x;
                numMap.put(x, numMap.getOrDefault(x, 0) + 1);
            }
            int groupSum = sum / group;
            for (int x : skill) {
                if (numMap.size() == 0) {
                    break;
                }
                if (numMap.getOrDefault(x, 0) == 0){
                    continue;
                }
                if (numMap.getOrDefault(groupSum-x, 0) == 0) {
                    return -1;
                }
                numMap.put(x, numMap.get(x) -1);
                numMap.put(groupSum-x, numMap.get(groupSum-x) -1);
                res += x * (groupSum-x);
                if (numMap.getOrDefault(groupSum-x, 0) == 0) {
                    numMap.remove(groupSum-x);
                }
                if (numMap.getOrDefault(x, 0) == 0) {
                    numMap.remove(x);
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {
        LeetCode6254.Solution solution = new LeetCode6254().new Solution();
        int [] skill = new int[]{5,3,7,1};
        System.out.println(solution.dividePlayers(skill));
    }
}
