package src.algorithms;

public class LeetCode0172 {
    class Solution {
        public int trailingZeroes(int n) {
            int res = 0;
            for (int i = 5; i <= n; i = i + 5) {
                int N = i;
                while (N % 5 ==  0) {
                    ++res;
                    N /= 5;
                }
            }
            return res;
        }
    }
}
