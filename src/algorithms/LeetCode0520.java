package src.algorithms;

public class LeetCode0520 {
    class Solution {
        public boolean detectCapitalUse(String word) {
            int count = 0;
            for (int i = 0; i < word.length(); ++i) {
                char ch = word.charAt(i);
                if (isCapitalLetter(ch)) {
                    ++count;
                }
            }

            return count == word.length() || count == 0
                    || (count == 1 && isCapitalLetter(word.charAt(0)));
        }
        public boolean isCapitalLetter(char ch) {
            return ch >= 'A' && ch <= 'Z';
        }
    }
}
