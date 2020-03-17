package src.algorithms;

public class LeetCode0041 {
    class Solution {
        public int firstMissingPositive(int[] nums) {
            if (nums.length == 0)
                return 1;
            for (int i = 0; i < nums.length; ++i) {
                while (nums[i] != i + 1  && nums[i]-1 >= 0 && nums[i]-1 <= nums.length - 1 && nums[nums[i]-1] != nums[i]) {
                    int temp = nums[nums[i]-1];
                    nums[nums[i]-1] = nums[i];
                    nums[i] = temp;
                }
            }
            for (int i = 0; i < nums.length; ++i) {
                if (nums[i] != i + 1)
                    return i+1;
            }
            return nums[nums.length-1] + 1;
        }
    }

    public static void  main(String[]args) {
        LeetCode0041.Solution solution = new LeetCode0041().new Solution();
        int []nums = new int[]{7,8,9,11,12};
        System.out.println(solution.firstMissingPositive(nums));
    }
}
