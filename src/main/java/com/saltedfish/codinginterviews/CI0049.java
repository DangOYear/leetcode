package com.saltedfish.codinginterviews;

/**
 *
 * 剑指 Offer 49. 丑数
 *
 * 我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。
 *
 *  
 *
 * 示例:
 *
 * 输入: n = 10
 * 输出: 12
 * 解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。
 * 说明:  
 *
 * 1 是丑数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/chou-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class CI0049 {
    class Solution {
        public int nthUglyNumber(int n) {
            int a = 0;
            int b = 0;
            int c = 0;
            int[] dp = new int[n];
            dp[0] = 1;
            for (int i = 1; i < n; ++i) {
                int mul2 = dp[a] * 2;
                int mul3 = dp[b] * 3;
                int mul5 = dp[c] * 5;

                dp[i] = Math.min(Math.min(mul2, mul3), mul5);
                if (dp[i] == mul2)  ++a;
                if (dp[i] == mul3)  ++b;
                if (dp[i] == mul5)  ++c;
            }
            return dp[n-1];
        }
    }

    public static void main(String[] args) {
        CI0049.Solution solution = new CI0049().new Solution();
        System.out.println(solution.nthUglyNumber(10));
    }
}
