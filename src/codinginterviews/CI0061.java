package src.codinginterviews;

import java.util.HashSet;
import java.util.Set;

public class CI0061 {
    class Solution {
        public boolean isStraight(int[] nums) {
            Set<Integer> repeat = new HashSet<>();
            int maxNum = -1;
            int minNum = Integer.MAX_VALUE;
            for (int x : nums) {
                if (x == 0) continue;
                if (!repeat.add(x))
                    return false;
                maxNum = Math.max(maxNum, x);
                minNum = Math.min(minNum, x);
            }
            return maxNum - minNum < 5;
        }
    }
}
