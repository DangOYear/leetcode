package com.saltedfish.algorithms;

import com.saltedfish.baseclass.TreeNode;

/**
 * @author SaltedFish
 * @date 2021/3/8
 */
public class LeetCode0236 {
    class Solution {

        private TreeNode res;

        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            res = null;
            dfs(root, p, q);
            return res;
        }

        private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null) {
                return false;
            }
            boolean inleft = dfs(root.left, p, q);
            boolean inright = dfs(root.right, p, q);
            if ((inleft && inright) || ((root.val == p.val || root.val == q.val) && (inleft || inright))) {
                res = root;
            }
            return inleft || inright || (root.val == p.val || root.val == q.val);
        }
    }
}
