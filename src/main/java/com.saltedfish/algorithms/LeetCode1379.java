package com.saltedfish.algorithms;

import src.algorithms.baseclass.TreeNode;

public class LeetCode1379 {
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
        public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
            if (original == null) {
                return null;
            }

            if (original == target) {
                return cloned;
            }


            TreeNode res = getTargetCopy(original.left, cloned.left, target);
            if (res != null) {
                return res;
            }

            res = getTargetCopy(original.right, cloned.right, target);
            if (res != null) {
                return res;
            }
            return null;
        }
    }
}
