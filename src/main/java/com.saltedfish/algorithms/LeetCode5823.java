package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/7/25
 */
public class LeetCode5823 {
    class Solution {
        public int getLucky(String s, int k) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                sb.append((s.charAt(i) - 'a' + 1));
            }

            for (int i = 0; i < k; i++) {
                int sum = 0;
                for (char c : sb.toString().toCharArray()) {
                    sum += c - '0';
                }
                sb = new StringBuilder(String.valueOf(sum));
            }
            return Integer.valueOf(sb.toString());
        }
    }

    public static void main(String[] args) {
        String s = "leetcode";
        int k = 2;
        LeetCode5823.Solution solution = new LeetCode5823().new Solution();
        System.out.println(solution.getLucky(s, k));
    }
}
