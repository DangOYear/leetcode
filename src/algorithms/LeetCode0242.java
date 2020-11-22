package src.algorithms;

public class LeetCode0242 {
    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }
            int[] letterTable = new int[26];
            for (int i = 0; i < s.length(); ++i) {
                letterTable[s.charAt(i) - 'a']++;
            }

            for (int i = 0; i < t.length(); ++i) {
                letterTable[t.charAt(i) - 'a']--;
                if (letterTable[t.charAt(i) - 'a'] < 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
