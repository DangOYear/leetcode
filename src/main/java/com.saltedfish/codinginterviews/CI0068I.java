package com.saltedfish.codinginterviews;


import com.saltedfish.baseclass.TreeNode;

public class CI0068I {
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null) {
                return null;
            }
            if (p.val == q.val) {
                return p;
            }
            while (root != null) {
                if (root.val < q.val && root.val < p.val) {
                    root = root.right;
                } else {
                    if (root.val > q.val && root.val > p.val) {
                        root = root.left;
                    }
                    else {
                        return root;
                    }
                }

            }
            return null;
        }
    }
}
