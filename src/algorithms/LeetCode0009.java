package src.algorithms;



public class LeetCode0009 {
    class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0)
                return false;

            String str = String.valueOf(x);

            return str.equals(new StringBuffer(str).reverse().toString());



        }
    }
}
