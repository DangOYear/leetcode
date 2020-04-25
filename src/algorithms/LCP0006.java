package src.algorithms;

public class LCP0006 {
    class Solution {
        public int minCount(int[] coins) {
            int res = 0;
            for (int x:coins) {
                res += (x + 1) / 2;
            }
            return res;
        }
    }
}
