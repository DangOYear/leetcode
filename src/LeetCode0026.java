package src;

public class LeetCode0026 {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int count = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[count] != nums[j]) {
                    ++count;
                    nums[count] = nums[j];
                }
            }
            return count + 1;
        }
    }
}
