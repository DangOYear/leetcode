package src.algorithms;


import java.util.Arrays;

/**
 *  16. 最接近的三数之和
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 *
 * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
 *
 * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 *
 * 解题思路：固定左边几个
 */




public class LeetCode0016 {

    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int res = nums[0] + nums[1] + nums[2];
            for (int i = 0; i < nums.length - 2; ++i) {
                int left = i + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int tempSum = nums[left] + nums[right] + nums[i];
                    if (Math.abs(target - tempSum) < Math.abs(target - res))
                        res = tempSum;

                    if (target < tempSum) {
                        right--;
                    }else {
                        if (target > tempSum) {
                            left++;
                        }else {
                            return res;
                        }
                    }
                }
            }
            return res;
        }
    }
}
