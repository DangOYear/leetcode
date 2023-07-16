package com.saltedfish.algorithms;


import com.saltedfish.baseclass.Node;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0590 {
    class Solution {
        public List<Integer> res;
        public List<Integer> postorder(Node root) {
            res = new ArrayList<>();
            if (root == null)
                return res;
            postTravel(root);
            res.add(root.val);
            return res;
        }

        void postTravel(Node node) {
            if (node != null) {
                for (Node n:node.children) {
                    postTravel(n);
                    res.add(n.val);
                }
            }
        }
    }
}
