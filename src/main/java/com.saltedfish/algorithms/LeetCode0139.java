package com.saltedfish.algorithms;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author SaltedFish
 * @date 2021/3/8
 */
public class LeetCode0139 {
    class Solution {
        public boolean wordBreak(String s, List<String> wordDict) {
            Set<String> wordDictSet = new HashSet<>(wordDict);
            boolean[] dp = new boolean[s.length() + 1];
            dp[0] = true;
            for (int i = 1; i <= s.length(); ++i) {
                for (int j = 0; j < i; ++j) {
                    if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                        dp[i] = true;
                        break;
                    }
                }
            }
            return dp[s.length()];
        }
    }
}
