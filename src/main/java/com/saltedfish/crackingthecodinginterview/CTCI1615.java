package com.saltedfish.crackingthecodinginterview;

import java.util.HashMap;
import java.util.Map;

public class CTCI1615 {
    class Solution {
        public int[] masterMind(String solution, String guess) {
            int hit = 0, nothit = 0;
            char[] sc = solution.toCharArray();
            char[] gc = guess.toCharArray();
            int[] hash = new int[128];
            for (int i = 0; i < sc.length; ++i) {
                if (sc[i] == gc[i]) {
                    gc[i] = '/';
                    ++hit;
                } else {
                    hash[sc[i]]++;
                }
            }

            for (int i = 0; i < gc.length; ++i) {
                if (hash[gc[i]] > 0) {
                    hash[gc[i]]--;
                    nothit++;
                }
            }
            return new int[]{hit, nothit};
        }
    }
}
