package src.crackingthecodinginterview;

import src.algorithms.baseclass.ListNode;
import src.algorithms.baseclass.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class CTCI0403 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public int maxHeight(TreeNode tree) {
            if (tree == null)
                return 0;
            else
                return 1 + Math.max(maxHeight(tree.left), maxHeight(tree.right));
        }
        public ListNode[] listOfDepth(TreeNode tree) {
            if (tree == null)   return new ListNode[]{};
            Queue<TreeNode> queue = new LinkedList<>();
            int height = maxHeight(tree);
            ListNode[] res = new ListNode[height];
            queue.offer(tree);
            int level = 0;
            while (!queue.isEmpty()) {
                ListNode head = null;
                ListNode p = head;
                int n = queue.size() - 1;
                for (int i = n; i >=0; --i) {
                    TreeNode node = queue.poll();
                    if (i == n) {
                        head = new ListNode(node.val);
                        p = head;
                    }else {
                        p.next = new ListNode(node.val);
                        p = p.next;
                    }
                    if (node.left != null)  queue.offer(node.left);
                    if (node.right != null) queue.offer(node.right);
                }
                res[level] = head;
                ++level;
            }
            return res;
        }
    }
}
