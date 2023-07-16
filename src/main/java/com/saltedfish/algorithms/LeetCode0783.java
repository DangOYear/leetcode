package com.saltedfish.algorithms;

import com.saltedfish.baseclass.TreeNode;

import java.util.Stack;

/**
 * @author SaltedFish
 * @date 2021/4/14
 */
public class LeetCode0783 {
    class Solution {
        public int minDiffInBST(TreeNode root) {
            Stack<TreeNode> inOrder = new Stack<>();
            int res = Integer.MAX_VALUE;
            int pre = -1;
            while (!inOrder.isEmpty() || root != null) {
                while (root != null) {
                    inOrder.push(root);
                    root = root.left;
                }
                root = inOrder.pop();
                if (pre != -1)
                    res = Math.min(res, Math.abs(root.val - pre));
                pre = root.val;

                root = root.right;
            }
            return res;
        }
    }
}
