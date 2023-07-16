package com.saltedfish.algorithms;


public class LeetCode0117 {
    // Definition for a Node.
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
        Node last = null;
        Node nextStart = null;
        public Node connect(Node root) {
            if (root == null) {
                return null;
            }
            Node start = root;
            while (start != null) {
                last = null;
                nextStart = null;
                for (Node p = start; p != null; p = p.next) {
                    if (p.left != null) {
                        handle(p.left);
                    }

                    if (p.right != null) {
                        handle(p.right);
                    }
                }
                start = nextStart;
            }
            return root;
        }

        public void handle(Node node) {
            if (last != null) {
                last.next = node;
            }
            if (nextStart == null) {
                nextStart = node;
            }
            last = node;
        }
    }
}
