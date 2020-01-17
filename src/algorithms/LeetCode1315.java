package src.algorithms;

import src.algorithms.baseclass.TreeNode;

public class LeetCode1315 {

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

        private int res;
        public int sumEvenGrandparent(TreeNode root) {
            int parent = 1;
            dfs(root, parent);
            return res;
        }

        public void dfs(TreeNode node, int parent) {
            if (node.left != null) {
                if (parent % 2 == 0) {
                    res += node.left.val;
                }
                dfs(node.left, node.val);
            }

            if (node.right != null) {
                if (parent % 2 == 0) {
                    res += node.right.val;
                }
                dfs(node.right, node.val);
            }
        }
    }

}
