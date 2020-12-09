package src.algorithms;

import java.util.Arrays;

public class LeetCode1637 {
    class Solution {
        public int maxWidthOfVerticalArea(int[][] points) {
            int res = Integer.MIN_VALUE;
            int[] target = new int[points.length];
            for (int i = 0; i < points.length; ++i) {
                target[i] = points[i][0];
            }
            Arrays.sort(target);

            for (int i = 0; i < target.length - 1; ++i) {
                res = Math.max(res, target[i+1] - target[i]);
            }
            return res;
        }
    }
}
