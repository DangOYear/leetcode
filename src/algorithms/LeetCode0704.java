package src.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeetCode0704 {
    class Solution {
        public int search(int[] nums, int target) {
            List<Integer> list = new ArrayList(Arrays.asList(nums));
            int res = Collections.binarySearch(list, target, null);
            return res;
        }
    }
}
