package src.algorithms;


import src.algorithms.baseclass.Node;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0590 {
    /*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
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
