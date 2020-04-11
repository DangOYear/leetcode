package src.codinginterviews;

import src.algorithms.baseclass.TreeNode;

import java.util.Stack;

public class CI0054 {

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
        public int kthLargest(TreeNode root, int k) {
            Stack<TreeNode> stack = new Stack<>();
            while (!stack.isEmpty() || root != null) {
                while (root != null) {
                    stack.push(root);
                    root = root.right;
                }

                TreeNode node = stack.pop();
                k--;
                if (k == 0)
                    return node.val;

                 root = node.left;
            }
            return -1;
        }
    }

}
