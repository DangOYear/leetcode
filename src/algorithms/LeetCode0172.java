package src.algorithms;

public class LeetCode0172 {
    class Solution {
        public int trailingZeroes(int n) {
            int res = 0;
            for (int i = 1; i <= n; ++i) {
                int N = i;
                while (N > 0) {
                    if (N % 5 == 0) {
                        ++res;
                        N /= 5;
                    }else {
                        break;
                    }
                }
            }
            return res;
        }

    }
}
