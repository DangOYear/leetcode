package com.saltedfish.crackingthecodinginterview;

import com.saltedfish.baseclass.TreeNode;

import java.util.Stack;

/**
 * @author SaltedFish
 * @date 2021/6/3
 */
public class CTCI0406 {
    class Solution {
        public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
            Stack<TreeNode> stack = new Stack<>();
            TreeNode pre = null;

            while (!stack.isEmpty() || root != null) {
                while (root != null) {
                    stack.push(root);
                    root = root.left;
                }

                root = stack.pop();

                if (p == pre) {
                    return root;
                }
                pre = root;
                root = root.right;
            }
            return null;
        }
    }
}
