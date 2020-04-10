package src.algorithms;

public class LeetCode0042 {
    class Solution {
        public int trap(int[] height) {

            if (height.length < 3)  return 0;

            int left = 0;
            int right = height.length - 1;

            int leftMax = height[left];
            int rightMax = height[right];
            int res = 0;

            while (left < right) {
                if (leftMax < rightMax) {
                    res += leftMax - height[left++];
                    leftMax = Math.max(height[left], leftMax);
                }else {
                    res += rightMax - height[right--];
                    rightMax = Math.max(height[right], rightMax);
                }
            }
            return res;

        }
    }
}
