package src.algorithms;

public class LeetCode0693 {
    class Solution {
        public boolean hasAlternatingBits(int n) {
            int pre = n % 2;
            n /= 2;
            while (n > 0) {
                if (pre == n % 2)
                    return false;
                pre = n % 2;
                n /= 2;
            }
            return true;
        }
    }
}
