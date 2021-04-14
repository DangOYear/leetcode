package com.saltedfish.algorithms;

import com.saltedfish.baseclass.TreeNode;

public class LeetCode1022 {
    class Solution {

        private int solve(TreeNode node, int sum) {
            if (node == null) {
                return 0;
            }
            sum = (sum << 1) + node.val;

            if (node.left == null && node.right == null) {
                return sum;
            }
            return solve(node.left, sum) + solve(node.right, sum);
        }

        public int sumRootToLeaf(TreeNode root) {
            return solve(root, 0);
        }
    }
}
