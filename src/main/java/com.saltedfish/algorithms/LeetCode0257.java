package com.saltedfish.algorithms;


import com.saltedfish.baseclass.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0257 {
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
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> paths = new ArrayList<>();
            constructPath(root, "", paths);
            return paths;
        }

        public void constructPath(TreeNode node, String path, List<String> paths) {
            if (node != null) {
                StringBuilder stringBuilder = new StringBuilder(path);
                stringBuilder.append(node.val);
                if (node.left == null && node.right == null) {
                    paths.add(stringBuilder.toString());
                } else {
                    stringBuilder.append("->");
                    constructPath(node.left, stringBuilder.toString(), paths);
                    constructPath(node.right, stringBuilder.toString(), paths);
                }
            }
        }

    }
}
