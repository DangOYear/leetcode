package com.saltedfish.algorithms;


import com.saltedfish.baseclass.Node;

public class LeetCode0559 {
    class Solution {
        public int maxDepth(Node root) {
            if (root == null) {
                return 0;
            }
            int max = 0;
            for (Node node : root.children) {
                max = Math.max(max, maxDepth(node));
            }
            return 1 + max;
        }
    }
}
