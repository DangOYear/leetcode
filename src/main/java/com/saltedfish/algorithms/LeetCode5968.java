package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2022/1/2
 */
public class LeetCode5968 {
    class Solution {
        public int numberOfBeams(String[] bank) {
            int res = 0;
            int pre = 0;
            for (String s : bank) {
                int cnt = 0;

                for (char ch : s.toCharArray()) {
                    if (ch == '1') {
                        ++cnt;
                    }
                }
                if (cnt == 0) {
                    continue;
                }
                res += pre * cnt;
                pre = cnt;
                cnt = 0;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        LeetCode5968.Solution solution = new LeetCode5968().new Solution();
        String[] bank = {"011001","000000","010100","001000"};
        System.out.println(solution.numberOfBeams(bank));
    }
}
