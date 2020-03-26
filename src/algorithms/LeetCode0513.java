package src.algorithms;

import src.algorithms.baseclass.TreeNode;

public class LeetCode0513 {
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
        int maxLevel;
        int res;
        public int findBottomLeftValue(TreeNode root) {
            maxLevel = 0;
            inOrder(root, 1);
            return res;
        }

        public void inOrder(TreeNode node, int level) {
            if (node == null)
                return;
            inOrder(node.left, level+1);
            if (level > maxLevel) {
                maxLevel = level;
                res = node.val;
            }
            inOrder(node.right, level+1);
        }
    }
}
