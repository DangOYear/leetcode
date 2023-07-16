package com.saltedfish.algorithms;


import com.saltedfish.baseclass.TreeNode;

public class LeetCode0099 {
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
        TreeNode firstNode;
        TreeNode secondNode;
        TreeNode preNode;
        public void findTwoReverse(TreeNode node) {
            if (node != null) {
                findTwoReverse(node.left);
                if (preNode != null && node.val < preNode.val) {
                    secondNode = node;
                    if (firstNode == null)  firstNode = preNode;
                    else return;
                }
                preNode = node;
                findTwoReverse(node.right);
            }
        }

        public void swap(TreeNode x, TreeNode y) {
            int temp = x.val;
            x.val = y.val;
            y.val = temp;
        }
        public void recoverTree(TreeNode root) {
            findTwoReverse(root);
            swap(firstNode, secondNode);
        }
    }
}
