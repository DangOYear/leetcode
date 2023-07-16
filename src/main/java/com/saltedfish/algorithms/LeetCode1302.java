package com.saltedfish.algorithms;


import com.saltedfish.baseclass.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode1302 {
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
        public int deepestLeavesSum(TreeNode root) {
            int deepestLeavesSum = 0;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int levelSum = 0;
                for (int i = queue.size() - 1; i >= 0; --i) {
                    TreeNode node = queue.poll();

                    levelSum += node.val;
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
                deepestLeavesSum = levelSum;
            }
            return deepestLeavesSum;
        }
    }
}
