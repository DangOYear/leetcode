package src.algorithms;

import java.util.*;




public class LeetCode0011 {
    class Solution {
        public int maxArea(int[] height) {
            int l = 0;
            int r = height.length - 1;
            int res = Integer.MIN_VALUE;
            while (l < r) {
                res = Math.max(Math.min(height[l], height[r]) * (r - l), res);
                if (height[l] > height[r]) {
                    r--;
                }else {
                    l++;
                }
            }

            return res;
        }
    }
}
