package src.algorithms;

public class LeetCode0342 {
    class Solution {
        public boolean isPowerOfFour(int num) {
            return num > 0 && ((num & (num - 1)) == 0) && num % 3 == 1;
        }
    }
}
