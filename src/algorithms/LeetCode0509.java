package src.algorithms;

public class LeetCode0509 {
    class Solution {

        public int fib(int N) {
            if (N <= 1)
                return N;
            return fib(N-1) + fib(N-2);
        }
    }
}
