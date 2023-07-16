package com.saltedfish.algorithms;


import com.saltedfish.baseclass.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode0111 {
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
        public int minDepth(TreeNode root) {
            int minDept = 0;
            Queue<TreeNode> queue = new LinkedList<>();
            if (root == null) {
                return 0;
            }
            queue.offer(root);

            while (!queue.isEmpty()) {
                minDept++;
                for (int i = queue.size()-1; i >= 0; --i) {
                    TreeNode node = queue.poll();
                    if (node.left == null && node.right == null) {
                        return minDept;
                    }
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
            }
            return minDept;
        }
    }

    public static void main(String[] args) {
        LeetCode0111.Solution solution = new LeetCode0111().new Solution();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(solution.minDepth(root));
    }
}
