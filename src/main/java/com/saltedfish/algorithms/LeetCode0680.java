package com.saltedfish.algorithms;

public class LeetCode0680 {
    class Solution {
        String str;
        public boolean validPalindrome(String s) {
            this.str = s;
            int left = 0;
            int right = str.length() - 1;
            while (left < right && str.charAt(left) == str.charAt(right)) {
                ++left;
                --right;
            }
            return left == right || palindrome(left, right-1) || palindrome(left+1, right);

        }

        public boolean palindrome(int left, int right) {
            while (left < right) {
                if (str.charAt(left) == str.charAt(right)) {
                    ++left;
                    --right;
                }else
                    return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {

        LeetCode0680.Solution solution = new LeetCode0680().new Solution();
        String s = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        System.out.println(solution.validPalindrome(s));

    }
}
//"aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxj jxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"