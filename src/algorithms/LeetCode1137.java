package src.algorithms;

public class LeetCode1137 {
    class Solution {
        public int tribonacci(int n) {
            int[] tribonacciSeq = new int[38];
            tribonacciSeq[0] = 0;
            tribonacciSeq[1] = 1;
            tribonacciSeq[2] = 1;

            for (int i = 3; i <= n; ++i) {
                tribonacciSeq[i] = tribonacciSeq[i-1] + tribonacciSeq[i-2] + tribonacciSeq[i-3];
            }
            return tribonacciSeq[n];
        }
    }
}
