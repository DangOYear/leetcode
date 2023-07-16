package com.saltedfish.algorithms;

import com.saltedfish.baseclass.TreeNode;

import java.util.*;


public class LeetCode0098 {
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
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        
        
        
        double preVal = -Double.MAX_VALUE;
        
        
        
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            
            root = stack.pop();
            
            if (root.val <= preVal)    return false;
            
            preVal = root.val;
            
            root = root.right;
            
        }
        
        return true;
    }
}

}
