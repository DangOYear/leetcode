package src.algorithms;

public class LeetCode0050 {
    class Solution {
        public double myPow(double x, int n) {
            if (x == 0) return 0;
            long exp = n;
            double res = 1.0;
            if (n < 0) {
                x = 1 / x;
                exp = - exp;
            }
            while (exp > 0) {
                if ((exp & 1) == 1) {
                    res *= x;
                }
                x *= x;
                exp >>= 1;
            }
            return res;
        }
    }
}
