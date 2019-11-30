package src;

import baseclass.TreeNode;

import java.util.HashSet;
import java.util.Set;


public class LeetCode1261 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    class FindElements {
        Set<Integer> cache;
        public FindElements(TreeNode root) {
            cache = new HashSet<Integer>();
            root.val = 0;
            cache.add(root.val);
            recover(root);
        }

        void recover(TreeNode node) {
            cache.add(node.val);
            if (node.left != null) {
                node.left.val = 2 * node.val + 1;
                recover(node.left);
            }

            if (node.right != null) {
                node.right.val = 2 * node.val + 2;
                recover(node.right);
            }
        }



        public boolean find(int target) {
            return cache.contains(target);
        }
    }

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */

}
