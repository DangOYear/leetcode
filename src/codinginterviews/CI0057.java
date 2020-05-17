package src.codinginterviews;

public class CI0057 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int l = 0;
            int r = nums.length - 1;
            int[] res = new int[2];

            while (l < r) {
                if (nums[l] + nums[r] == target) {
                    res[0] = nums[l];
                    res[1] = nums[r];
                    break;
                }else {
                    if (nums[l] + nums[r] < target) {
                        ++l;
                    }else {
                        --r;
                    }
                }
            }
            return res;
        }
    }
}
