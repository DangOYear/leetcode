package src.algorithms;

public class LeetCode0058 {
    class Solution {
        public int lengthOfLastWord(String s) {
            s = s.trim();
            if (s.equals(""))
                return 0;
            String[] words = s.split(" ");
            return words[words.length-1].length();
        }
    }
}
