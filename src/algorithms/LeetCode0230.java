package src.algorithms;

import java.util.*;




public class LeetCode0230 {
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
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        int count = 0;
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            ++count;
            if (count == k)
                return root.val;
            
            root= root.right;

            
        }
        
        return -1;
    }
}
}
