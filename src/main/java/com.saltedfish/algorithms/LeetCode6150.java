package com.saltedfish.algorithms;

public class LeetCode6150 {
    class Solution {
        public String smallestNumber(String pattern) {
            int n = pattern.length();
            int[] nums = new int[n+1];
            int count = 1;
            if (n == 1) {
                return new String("1");
            }
            int pos = 0;
            if (pattern.charAt(0) == 'I') {
                nums[0] = 1;
                nums[1] = 2;
                ++count;
                ++count;
                ++pos;
            }

            if (pattern.charAt(0) == 'D') {
                pos = 1;
                int countTemp = 1;
                while (pos < n && pattern.charAt(pos) == 'D') {
                    ++pos;
                    ++countTemp;
                }
                for (int temp = countTemp; temp >= 0; temp--) {
                    nums[temp] = count;
                    ++count;
                }
            }

            for (int i = pos; i < n; i++) {
                if (pattern.charAt(i) == 'I') {
                    nums[i+1] = count;
                    ++count;
                }
                if (pattern.charAt(i) == 'D') {
                    int countTemp = i;
                    while (i < n && pattern.charAt(i) == 'D') {
                        ++i;
                    }
                    for (int temp = i; temp > countTemp; temp--) {
                        nums[temp] = count;
                        ++count;
                    }
                    i = i-1;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < (n + 1); i++) {
                sb.append(nums[i]);
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        LeetCode6150.Solution solution = new LeetCode6150().new Solution();
        System.out.println(solution.smallestNumber("IIIDIDDD"));
    }
}
