package src.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1389 {

    class Solution {
        public int[] createTargetArray(int[] nums, int[] index) {
            int[] res = new int[nums.length];
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; ++i) {
                list.add(index[i], nums[i]);
            }
            for (int i = 0; i < res.length; ++i) {
                res[i] = list.get(i);
            }
            return res;
        }
    }
}
