package src.algorithms;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0448 {
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            List<Integer> res = new ArrayList<>();
            for (int x : nums) {
                int newIndex = Math.abs(x) - 1;
                if (nums[newIndex] > 0) {
                    nums[newIndex] = -nums[newIndex];
                }
            }

            for (int i = 0; i < nums.length; ++i) {
                if (nums[i] > 0) {
                    res.add(i+1);
                }
            }
            return res;
        }
    }
}
