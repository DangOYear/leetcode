package com.saltedfish.algorithms;

import java.util.Arrays;

/**
 * @author SaltedFish
 * @date 2021/5/9
 */
public class LeetCode5751 {
    class Solution {

        private int binarySearch(int target, int[] nums, int l, int r) {
            while (l <= r) {
                int mid = (l + r) / 2;
                if (nums[mid] >= target) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }

            }
            return Math.max((l - 1), 0);
        }

        public int maxDistance(int[] nums1, int[] nums2) {
            int res = 0;
            for (int i = 0; i < nums1.length; i++) {
                if (i > nums2.length - 1) {
                    break;
                }
                if (nums2[i] < nums1[i]) {
                    continue;
                }
                int pos = binarySearch(nums1[i], nums2, i, nums2.length - 1);
                res = Math.max(res, pos - i);
            }
            return res;
        }
    }

    public static void main(String[] args) {
        LeetCode5751.Solution solution = new LeetCode5751().new Solution();
        int[] nums1 = new int[]{55,30,5,4,2};
        int[] nums2 = new int[]{100,20,10,10,5};
        System.out.println(solution.maxDistance(nums1, nums2));

        System.out.println("----");
        nums1 = new int[]{2,2,2};
        nums2 = new int[]{10,10,1};
        System.out.println(solution.maxDistance(nums1, nums2));
    }
}
