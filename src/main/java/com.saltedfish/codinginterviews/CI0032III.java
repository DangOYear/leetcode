package com.saltedfish.codinginterviews;

import src.algorithms.baseclass.TreeNode;

import java.util.*;

public class CI0032III {
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
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();

            if (root == null)
                return res;

            Queue<TreeNode> queue = new LinkedList<>();

            queue.offer(root);

            boolean reverse = false;

            while (!queue.isEmpty()) {
                List<Integer> level = new ArrayList<>();

                for (int i = queue.size() - 1; i >= 0; --i) {
                    TreeNode node = queue.poll();
                    level.add(node.val);
                    if (node.left != null)  queue.offer(node.left);
                    if (node.right != null) queue.offer(node.right);
                }

                if (reverse) {
                    Collections.reverse(level);
                }

                reverse = !reverse;

                res.add(level);
            }
            return res;
        }
    }
}
