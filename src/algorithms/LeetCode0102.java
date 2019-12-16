package src.algorithms;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import src.algorithms.baseclass.TreeNode;

public class LeetCode0102 {
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
            List<List<Integer>> res = new LinkedList<>();

            Queue<TreeNode> queue = new LinkedList<>();
            if (root != null)
                queue.offer(root);

            while (!queue.isEmpty()) {
                List<Integer> oneLevel = new ArrayList<>();
                for (int i = queue.size() - 1; i >= 0; --i) {
                    TreeNode node = queue.poll();
                    oneLevel.add(node.val);
                    if (node.left != null) queue.offer(node.left);
                    if (node.right != null) queue.offer(node.right);
                }
                res.add(oneLevel);
            }
            return res;
        }
    }
}
