package com.saltedfish.algorithms;

import com.saltedfish.baseclass.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0113 {
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
        private List<List<Integer>> res;
        private int target;

        public List<List<Integer>> pathSum(TreeNode root, int sum) {
            res = new ArrayList<>();
            List<Integer> onePath= new ArrayList<>();
            target = sum;
            dfs(root, 0, onePath);
            return res;
        }

        public void dfs(TreeNode node, int count, List<Integer> onePath) {
            if (node != null) {
                count += node.val;
                onePath.add(node.val);
                if (count == target && node.left == null && node.right == null) {
                    res.add(new ArrayList<>(onePath));
                }
                dfs(node.left, count, onePath);
                dfs(node.right, count, onePath);
                if (onePath.size() >= 1) {
                    onePath.remove(onePath.size() - 1);
                }
            }
        }
    }

}
