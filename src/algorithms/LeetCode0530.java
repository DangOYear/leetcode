package src.algorithms;



import src.algorithms.baseclass.TreeNode;

import java.util.Stack;

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
        public int getMinimumDifference(TreeNode root) {
            Stack<TreeNode> inOrder = new Stack<>();
            int res = Integer.MAX_VALUE;
            int pre = -1;
            while (!inOrder.isEmpty() || root != null) {
                while (root != null) {
                    inOrder.push(root);
                    root = root.left;
                }
                root = inOrder.pop();
                if (pre != -1)
                    res = Math.min(res, Math.abs(root.val - pre));
                 pre = root.val;

                 root = root.right;
            }
            return res;
        }
    }
}
