package com.saltedfish.algorithms;

import src.algorithms.baseclass.TreeNode;

public class LeetCode1325 {

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
        public TreeNode removeLeafNodes(TreeNode root, int target) {
            if (root == null)
                return null;


            removeLeafNodes(root.left, target);
            removeLeafNodes(root.right, target);

            if (root.left != null && root.left.left == null && root.left.right == null && root.left.val == target)
                root.left = null;

            if (root.right != null && root.right.left == null && root.right.right == null && root.right.val == target)
                root.right = null;

            if (root.left == null && root.right == null && root.val == target)
                return null;
            return root;
        }
    }


}
