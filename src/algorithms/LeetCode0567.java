package src.algorithms;

import java.util.HashMap;
import java.util.Map;

public class LeetCode0567 {
    class Solution {
        public boolean checkInclusion(String s1, String s2) {
            if (s1.length() > s2.length())
                return false;
            int[] s1Hash = new int[26];
            for (char ch:s1.toCharArray()) {
                s1Hash[ch - 'a']++;
            }

            for (int i = 0; i <= s2.length() - s1.length(); ++i) {
                int[] s2Hash = new int[26];
                for (int j = 0; j < s1.length(); ++j) {
                    s2Hash[s2.charAt(i + j) - 'a']++;
                }
                if (isSame(s1Hash, s2Hash))
                    return true;
            }
            return false;

        }

        public boolean isSame(int[] s1Hash, int[] s2Hash){
            for (int i = 0; i < 26; ++i) {
                if (s1Hash[i] != s2Hash[i]) {
                    return false;
                }
            }
            return true;
        }
    }
}
