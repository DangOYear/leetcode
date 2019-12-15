package src.algorithms;



public class LeetCode0557 {
    class Solution {
        public String reverseWords(String s) {
            String[] words = s.split(" ");
            StringBuilder res = new StringBuilder();
            for (String word: words) {
                res.append(new StringBuffer(word).reverse().toString() + " ");
            }
            return res.toString().trim();
        }
    }
}
