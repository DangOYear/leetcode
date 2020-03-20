package src.codinginterviews;

import src.algorithms.baseclass.TreeNode;

public class CI0055I {
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
        public int maxDepth(TreeNode root) {
            if (root == null)
                return 0;
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    }
}
