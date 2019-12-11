package src;


import baseclass.Node;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0589 {
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
                    dfs(node);
                }
            }
        }
    }
}
