package src.algorithms;

import java.util.HashMap;
import java.util.Map;

public class LeetCode0205 {
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            int n = s.length();
            int[] mapS = new int[128];
            int[] mapT = new int[128];
            for (int i = 0; i < n; ++i) {
                int ch1 = s.charAt(i);
                int ch2 = t.charAt(i);
                if (mapS[ch1] != mapT[ch2]) {
                    return false;
                } else {
                    if (mapS[ch1] == 0) {
                        mapS[ch1] = i + 1;
                        mapT[ch2] = i + 1;
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        LeetCode0205.Solution solution = new LeetCode0205().new Solution();
        String s = "ab";
        String t = "aa";

        System.out.println(solution.isIsomorphic(s, t));

    }
}
