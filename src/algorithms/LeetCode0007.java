package src.algorithms;

public class LeetCode0007 {
    class Solution {
        public int reverse(int x) {
            boolean isNegative = false;
            int res = 0;
            if (x < 0) {
                isNegative = true;
                x = -x;
            }

            while (x > 0) {
                int num = x % 10;
                x /= 10;
                if (res > Integer.MAX_VALUE / 10)
                    return 0;
                res = res * 10 + num;
            }
            return isNegative? -res:res;
        }
    }
}
