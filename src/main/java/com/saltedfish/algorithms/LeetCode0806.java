package com.saltedfish.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode0806 {
    class Solution {
        public int[] numberOfLines(int[] widths, String S) {
            char alpha = 'a';
            int res[] = new int[2];
            res[0] = 1;
            res[1] = 0;
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < widths.length; ++i) {
                map.put((char)(alpha + i), widths[i]);
            }

            for (int i = 0; i < S.length(); i++) {
                res[1] = res[1] + map.get(S.charAt(i));
                if (res[1] > 100) {
                    ++res[0];
                    res[1] = map.get(S.charAt(i));
                } else {
                    if (res[1] == 100) {
                        ++res[0];
                        res[1] = 0;
                    }
                }

            }

            return res;
        }
    }

    public static void main(String[] args) {
        LeetCode0806.Solution solution = new LeetCode0806().new Solution();

        int[] width = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String S = "bbbcccdddaaa";
        int[] res = solution.numberOfLines(width, S);

        for (int x:res) {
            System.out.println(x);
        }
    }
}
