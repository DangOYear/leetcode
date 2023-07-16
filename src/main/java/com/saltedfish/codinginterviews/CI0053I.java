package com.saltedfish.codinginterviews;

/**
 *
 * 剑指 Offer 53 - I. 在排序数组中查找数字 I
 *
 * 统计一个数字在排序数组中出现的次数。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: 2
 * 示例 2:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: 0
 *  
 *
 * 限制：
 *
 * 0 <= 数组长度 <= 50000
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class CI0053I {

    class Solution {
        public int getFirstTarget(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (nums[mid] == target) {
                    if (mid > 0 && nums[mid-1] != target || mid == 0) {
                        return mid;
                    } else {
                        right = mid - 1;
                    }
                } else {
                    if (nums[mid] < target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }
            return -1;
        }

        public int getLastTarget(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (nums[mid] == target) {
                    if (mid < nums.length - 1 && nums[mid+1] != target || mid == nums.length - 1) {
                        return mid;
                    } else {
                        left = mid + 1;
                    }
                } else {
                    if (nums[mid] < target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }
            return -1;
        }

        public int search(int[] nums, int target) {
            int left = getFirstTarget(nums, target);
            int right = getLastTarget(nums, target);
            if (left != -1 && right != -1) {
                return right - left + 1;
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        CI0053I.Solution solution = new CI0053I().new Solution();
        int[] nums = new int[] {5,7,7,8,8,10};
        int target = 8;
        System.out.println(solution.getFirstTarget(nums, target));
        System.out.println(solution.getLastTarget(nums, target));
    }

}
