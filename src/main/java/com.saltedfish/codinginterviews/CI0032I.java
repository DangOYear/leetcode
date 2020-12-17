package com.saltedfish.codinginterviews;


import com.saltedfish.baseclass.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CI0032I {
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
        public int[] levelOrder(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            List<Integer> list = new ArrayList<>();

            if (root == null) {
                return new int[]{};
            }

            queue.offer(root);

            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            int[] res = new int[list.size()];
            for (int i = 0; i < res.length; ++i) {
                res[i] = list.get(i);
            }
            return res;
        }
    }
}
