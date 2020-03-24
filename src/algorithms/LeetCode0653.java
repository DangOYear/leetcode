package src.algorithms;

import src.algorithms.baseclass.TreeNode;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode0653 {
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
        Set<Integer> set;
        int k;
        public boolean findTarget(TreeNode root, int k) {
            set = new HashSet<>();
            this.k = k;
            return find(root);
        }

        public boolean find(TreeNode root) {
            if (root == null)
                return false;
            if (set.contains(k - root.val))
                return true;
            set.add(root.val);
            return find(root.left) || find(root.right);
        }
    }
}
