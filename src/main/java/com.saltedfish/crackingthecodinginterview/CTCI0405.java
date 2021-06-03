package com.saltedfish.crackingthecodinginterview;

import com.saltedfish.baseclass.TreeNode;

import java.util.Stack;

/**
 * @author SaltedFish
 * @date 2021/6/3
 */
public class CTCI0405 {
    class Solution {

        public boolean isValidBST(TreeNode root) {
            Stack<TreeNode> stack = new Stack<>();
            double pre = -Double.MAX_VALUE;

            while (!stack.isEmpty() || root != null) {
                while (root != null) {
                    stack.push(root);
                    root = root.left;
                }
                root = stack.pop();

                if (root.val <= pre) {
                    return false;
                }

                pre = root.val;
                root = root.right;
            }
            return true;
        }
    }
}
