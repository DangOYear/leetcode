package src.algorithms;

public class LeetCode1351 {
    class Solution {
        public int countNegatives(int[][] grid) {
            int res = 0;
            int m = grid[0].length;
            int pos = m - 1;

            for (int[] nums: grid) {
                int i;
                for (i = pos; i >= 0; --i) {
                    if (nums[i] >= 0) {
                        if (i + 1 < m) {
                            pos = i + 1;
                            res += m - pos;
                        }
                        break;
                    }
                }
                if (i == -1) {
                    res += m;
                    pos = -1;
                }
            }
            return res;
        }
    }
}
