package com.saltedfish.algorithms;


import com.saltedfish.baseclass.TreeNode;

import java.util.Stack;

public class LeetCode0538 {
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
        public TreeNode convertBST(TreeNode root) {
            TreeNode p = root;
            Stack<TreeNode> stack = new Stack<>();
            int res = 0;
            while (!stack.isEmpty() || p != null) {
                while (p != null) {
                    stack.push(p);
                    p = p.right;
                }
                p = stack.pop();
                res += p.val;
                p.val = res;
                p = p.left;
            }
            return root;
        }
    }
}
