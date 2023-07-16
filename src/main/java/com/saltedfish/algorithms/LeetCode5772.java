package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/5/30
 */
public class LeetCode5772 {
    class Solution {
        public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
            StringBuilder result = new StringBuilder();


            int i = firstWord.length() - 1;
            int j = secondWord.length() - 1;
            int change = 0;
            while (i >= 0 || j >= 0) {
                char x = i >= 0 ? firstWord.charAt(i) : 'a';
                char y = j >= 0 ? secondWord.charAt(j) : 'a';
                int sum = x - 'a' + y - 'a' + change;
                result.append((char)(sum % 10 + 'a'));
                change = sum / 10;
                i--;
                j--;
            }
            if (change > 0) {
                result.append((char)(change + 'a'));
            }

            String resultString = result.reverse().toString();

            int pos = 0;
            while (pos < resultString.length() && resultString.charAt(pos) == 'a') {
                ++pos;
            }
            resultString = resultString.substring(pos);


            pos = 0;
            while (pos < targetWord.length() && targetWord.charAt(pos) == 'a') {
                ++pos;
            }

            return targetWord.substring(pos).equals(resultString);
        }
    }

    public static void main(String[] args) {
        LeetCode5772.Solution solution = new LeetCode5772().new Solution();
        String firstWord = "aaa";
        String secondWord = "a";
        String targetWord = "aaaa";
        System.out.println(solution.isSumEqual(firstWord, secondWord, targetWord));
    }
}
