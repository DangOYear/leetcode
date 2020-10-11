package src.algorithms;

/**
 *
 * 416. 分割等和子集
 *
 * 给定一个只包含正整数的非空数组。是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
 *
 * 注意:
 *
 * 每个数组中的元素不会超过 100
 * 数组的大小不会超过 200
 * 示例 1:
 *
 * 输入: [1, 5, 11, 5]
 *
 * 输出: true
 *
 * 解释: 数组可以分割成 [1, 5, 5] 和 [11].
 *  
 *
 * 示例 2:
 *
 * 输入: [1, 2, 3, 5]
 *
 * 输出: false
 *
 * 解释: 数组不能分割成两个元素和相等的子集.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/partition-equal-subset-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class LeetCode0416 {
    class Solution {
        public boolean canPartition(int[] nums) {
            int n = nums.length;
            if (n < 2)
                return false;
            int sum = 0;
            int maxNum = 0;
            int target = 0;
            for (int x : nums) {
                sum += x;
                maxNum = Math.max(maxNum, x);
            }
            if (sum % 2 == 1) {
                return false;
            }
            target = sum / 2;
            if (maxNum > target) {
                return false;
            }
            boolean[] dp = new boolean[target+1];
            dp[0] = true;
            for (int i = 0; i < n; ++i) {
                int num = nums[i];
                for (int j = target; j >= num; --j) {
                    dp[j] |= dp[j-num];
                }
            }
            return dp[target];
        }
    }

    public static void main(String[] args) {
        LeetCode0416.Solution solution = new LeetCode0416().new Solution();
        int[] nums = new int[]{1, 5, 11, 5};
        System.out.println(solution.canPartition(nums));
        nums = new int[]{1, 2, 3, 5};
        System.out.println(solution.canPartition(nums));
    }
}
