package src.algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode0116 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    class Solution {
        public Node connect(Node root) {
            if (root == null)
                return null;

            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);

            while (!queue.isEmpty()) {
                Node pre = null;
                for (int i = queue.size() - 1; i >= 0; --i) {
                       Node now = queue.poll();
                       if (pre != null) {
                           pre.next = now;
                       }
                       pre = now;
                       if (now.left != null) queue.offer(now.left);
                       if (now.right != null) queue.offer(now.right);
                }
            }
            return root;
        }
    }



}
