package com.saltedfish.algorithms;


import com.saltedfish.baseclass.Node;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0589 {
    class Solution {
        List<Integer> res;
        public List<Integer> preorder(Node root) {
            res = new ArrayList<>();
            dfs(root);
            return res;
        }

        void dfs(Node node) {
            if (node != null) {
                res.add(node.val);
                List<Node> children = node.children;
                for (Node c:children) {
                    dfs(c);
                }
            }
        }
    }
}
