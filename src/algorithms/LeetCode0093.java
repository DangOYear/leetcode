package src.algorithms;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0093 {
    class Solution {
        final int SEG_COUNT = 4;
        List<String> res;
        int[] segments;

        public List<String> restoreIpAddresses(String s) {
            res = new ArrayList<>();
            segments = new int[SEG_COUNT];
            dfs(s, 0, 0);
            return res;
        }

        public void dfs(String s, int segId, int segStart) {
            if (segId == SEG_COUNT) {
                if (segStart == s.length()) {
                    StringBuilder ip = new StringBuilder();
                    for (int i = 0; i < SEG_COUNT; ++i) {
                        ip.append(segments[i]);
                        if (i != SEG_COUNT - 1) {
                            ip.append('.');
                        }
                    }
                    res.add(ip.toString());
                }
                return;
            }

            if (segStart == s.length()) {
                return;
            }

            if (s.charAt(segStart) == '0') {
                segments[segId] = 0;
                dfs(s, segId + 1, segStart + 1);
            }

            int addr = 0;
            for (int segEnd = segStart; segEnd < s.length(); ++segEnd) {
                addr = addr * 10 + s.charAt(segEnd) - '0';
                if (addr > 0 && addr < 256) {
                    segments[segId] = addr;
                    dfs(s, segId + 1, segEnd + 1);
                } else {
                    break;
                }
            }
        }
    }
}
