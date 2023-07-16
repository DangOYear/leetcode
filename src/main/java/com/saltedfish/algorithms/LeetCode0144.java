package com.saltedfish.algorithms;

import com.saltedfish.baseclass.TreeNode;

import java.util.*;


public class LeetCode0144 {
/**
 *  * Definition for a binary tree node.
 *   * public class TreeNode {
 *    *     int val;
 *     *     TreeNode left;
 *      *     TreeNode right;
 *       *     TreeNode(int x) { val = x; }
 *        * }
 *         */
    class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();

            if (root == null) {
                return res;
            }

            stack.push(root);

            while (!stack.isEmpty()) {
                TreeNode node = stack.pop();
                res.add(node.val);

                if (node.right != null) {
                    stack.push(node.right);
                }

                if (node.left != null) {
                    stack.push(node.left);
                }

            }

            return res;

        }
    }
}
