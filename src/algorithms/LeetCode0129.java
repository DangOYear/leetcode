package src.algorithms;

import src.algorithms.baseclass.TreeNode;

public class LeetCode0129 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public int dfs(TreeNode node, int prefixSum) {
            if (node == null) {
                return 0;
            }
            int sum = prefixSum * 10 + node.val;
            if (node.left == null && node.right == null) {
                return sum;
            } else {
                return dfs(node.left, sum) + dfs(node.right, sum);
            }
        }

        public int sumNumbers(TreeNode root) {
            return dfs(root, 0);
        }
    }
}
