package src.algorithms;

import java.util.*;




public class LeetCode0199 {
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null)
            return res;
        
        queue.offer(root);
        while (!queue.isEmpty()) {
            
            for (int i = queue.size()-1; i >= 0; --i) {
                TreeNode node = queue.poll();
                if (node.left != null)    queue.offer(node.left);
                if (node.right != null)    queue.offer(node.right);
                if (i == 0)
                    res.add(node.val);
            }
            
            
        }
        
        return res;
    }
}
}
