package src;


import baseclass.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode0965 {
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
        Set<Integer> value;
        public boolean isUnivalTree(TreeNode root) {
            value = new HashSet<>();
            dfs(root);
            return value.size() == 1;
        }

        public void dfs(TreeNode node) {
            if (node != null) {
                value.add(node.val);
                dfs(node.left);
                dfs(node.right);
            }
        }
    }
}
