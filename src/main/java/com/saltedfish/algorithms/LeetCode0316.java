package com.saltedfish.algorithms;

public class LeetCode0316 {
    class Solution {
        public String removeDuplicateLetters(String s) {
            boolean[] visited = new boolean[26];
            int[] nums = new int[26];
            for (int i = 0; i < s.length(); ++i) {
                nums[s.charAt(i) - 'a']++;
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < s.length(); ++i) {
                char ch = s.charAt(i);
                if (!visited[ch - 'a']) {
                    while (stringBuilder.length() > 0 && stringBuilder.charAt(stringBuilder.length() - 1) > ch) {
                        if (nums[stringBuilder.charAt(stringBuilder.length() - 1) - 'a'] > 0) {
                            visited[stringBuilder.charAt(stringBuilder.length() - 1) - 'a'] = false;
                            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                        } else {
                            break;
                        }
                    }
                    visited[ch - 'a'] = true;
                    stringBuilder.append(ch);
                }
                nums[ch - 'a'] -= 1;
            }
            return stringBuilder.toString();
        }
    }

    public static void main(String[] args) {
        LeetCode0316.Solution solution = new LeetCode0316().new Solution();
        System.out.println(solution.removeDuplicateLetters("cbacdcbc"));
    }
}
