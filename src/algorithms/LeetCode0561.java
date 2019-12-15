package src.algorithms;

import java.util.Arrays;

public class LeetCode0561 {
    class Solution {
        public int arrayPairSum(int[] nums) {
            int res = 0;
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i += 2) {
                res += nums[i];
            }
            return res;
        }
    }
}


//Runtime: 15 ms, faster than 41.79% of Java online submissions for Array Partition I.
//Memory Usage: 38.9 MB, less than 100.00% of Java online submissions for Array Partition I.