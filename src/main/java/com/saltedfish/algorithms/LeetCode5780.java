package com.saltedfish.algorithms;


import java.util.Stack;

/**
 * @author SaltedFish
 * @date 2021/6/26
 */
public class LeetCode5780 {
    class Solution {
        public boolean canBeIncreasing(int[] nums) {

            Stack<Integer> stack = new Stack<>();
            int pos = 0;
            int count = 0;
            while (pos < nums.length) {
                if (stack.isEmpty() || nums[pos] > stack.peek()) {
                    stack.push(nums[pos]);
                    ++pos;
                    continue;
                }
                if (nums[pos] <= stack.peek()) {
                    int num = stack.pop();
                    if (!stack.isEmpty() && nums[pos] <= stack.peek()) {
                        stack.push(num);
                        ++pos;
                    }
                    ++count;
                }
                if (count > 1) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        LeetCode5780.Solution solution = new LeetCode5780().new Solution();
        int[] nums = new int[]{105,924,32,968};
        System.out.println(solution.canBeIncreasing(nums));
    }
}
