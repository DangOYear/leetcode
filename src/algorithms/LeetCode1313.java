package src.algorithms;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1313 {
    class Solution {
        public int[] decompressRLElist(int[] nums) {
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < nums.length - 1; i = i + 2) {
                int cnt = nums[i];
                for (int j = 0; j < cnt; ++j) {
                    list.add(nums[i+1]);
                }
            }
            int[] res = new int[list.size()];
            for (int i = 0; i < list.size(); ++i) {
                res[i] = list.get(i);
            }
            return res;
        }
    }
}
