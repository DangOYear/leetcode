package src;


import baseclass.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0872 {
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
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            List<Integer> leafSeq1 = new ArrayList<>();
            List<Integer> leafSeq2 = new ArrayList<>();

            dfs(root1, leafSeq1);
            dfs(root2, leafSeq2);

            return leafSeq1.equals(leafSeq2);

        }

        void dfs(TreeNode node, List<Integer> leafSeq) {
            if (node != null) {
                if (node.left == null && node.right == null) {
                    leafSeq.add(node.val);
                }
                dfs(node.left, leafSeq);
                dfs(node.right, leafSeq);
            }
        }
    }
}
