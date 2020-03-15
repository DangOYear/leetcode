package src.algorithms;

import java.util.*;




public class LeetCode0103 {
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        if (root != null) {
            queue.offer(root);
        }
        
        boolean needReverse = false;
        
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            
            for (int i = queue.size()-1; i >= 0; --i) {
                TreeNode node = queue.poll();
                level.add(node.val);
                
                if (node.left != null)    queue.offer(node.left);
                if (node.right != null)    queue.offer(node.right);
            }
            if (needReverse) {
                Collections.reverse(level);
            }
            needReverse = !needReverse;
            res.add(level);
        }
        
        return res;
    }
}
}
