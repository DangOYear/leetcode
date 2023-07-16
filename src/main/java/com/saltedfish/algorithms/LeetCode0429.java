package com.saltedfish.algorithms;


import com.saltedfish.baseclass.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode0429 {

    class Solution {
        public List<List<Integer>> levelOrder(Node root) {
            List<List<Integer>> res = new ArrayList<>();
            Queue<Node> queue = new LinkedList<>();
            if (root == null) {
                return res;
            }

            queue.offer(root);

            while (!queue.isEmpty()) {
                List<Integer> level = new ArrayList<>();
                for (int i = queue.size()-1; i >= 0; --i) {
                    Node node = queue.poll();
                    level.add(node.val);
                    for (Node node1:node.children) {
                        queue.offer(node1);
                    }
                }
                res.add(level);
            }
            return res;
        }
    }
}
