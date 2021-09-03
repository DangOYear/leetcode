package com.saltedfish.algorithms;


import java.util.HashSet;
import java.util.Set;

/**
 * @author SaltedFish
 * @date 2021/9/3
 */
public class LeetCode1980 {
    class Solution {

        public int calculate(String binaryString) {
            int res = 0;
            for (char ch : binaryString.toCharArray()) {
                res = res * 2 + ch - '0';
            }
            return res;
        }

        public String toBinaryString(int val, int len) {
            StringBuilder res = new StringBuilder();
            while (val > 0 || res.length() < len) {
                res.append(val % 2);
                val /= 2;
            }
            return res.reverse().toString();
        }

        public String findDifferentBinaryString(String[] nums) {
            Set<Integer> numSet = new HashSet<>();
            for (String num : nums) {
                numSet.add(calculate(num));
            }

            int val = 0;
            while (numSet.contains(val)) {
                ++val;
            }

            return toBinaryString(val, nums[0].length());
        }
    }

    public static void main(String[] args) {
        LeetCode1980.Solution solution = new LeetCode1980().new Solution();
        String[] nums = new String[]{"00","01"};
        System.out.println(solution.findDifferentBinaryString(nums));
    }
}
