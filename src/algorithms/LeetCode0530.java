package src.algorithms;



import src.algorithms.baseclass.TreeNode;

public class LeetCode0530 {
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
        int minDifference;
        int pre;
        public int getMinimumDifference(TreeNode root) {

            minDifference = Integer.MAX_VALUE;
            pre = Integer.MAX_VALUE - (root.val);
            dfs(root, pre);
            return minDifference;
        }

        void dfs(TreeNode node, int pre) {
            if (node != null) {
                dfs(node.left, pre);
                minDifference = Math.min(minDifference, node.val - pre);
                dfs(node.right, pre);
            }
        }
    }
}
