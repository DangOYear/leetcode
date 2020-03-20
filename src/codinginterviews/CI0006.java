package src.codinginterviews;

import src.algorithms.baseclass.ListNode;

import java.util.Stack;

public class CI0006 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public int[] reversePrint(ListNode head) {
            Stack<Integer> stack = new Stack<>();
            while (head != null) {
                stack.push(head.val);
                head = head.next;
            }

            int n = stack.size();
            int[] res = new int[n];
            for (int i = 0; i < n; ++i) {
                res[i] = stack.pop();
            }
            return res;
        }
    }
}
