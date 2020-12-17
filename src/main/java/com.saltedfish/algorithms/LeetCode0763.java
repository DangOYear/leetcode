package com.saltedfish.algorithms;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0763 {
    class Solution {
        public List<Integer> partitionLabels(String S) {

            int[] last = new int[26];
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < S.length(); ++i) {
                last[S.charAt(i) - 'a'] = i;
            }

            int j = 0;
            int anchor = 0;
            for (int i = 0; i < S.length(); ++i) {
                j = Math.max(j, last[S.charAt(i) - 'a']);
                if (i == j) {
                    res.add(i - anchor + 1);
                    anchor = i + 1;
                }
            }
            return res;
        }
    }
}
