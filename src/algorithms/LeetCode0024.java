package src.algorithms;

import src.algorithms.baseclass.ListNode;

public class LeetCode0024 {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode firstNode = head.next;
            ListNode secondNode = head;

            secondNode.next = swapPairs(firstNode.next);
            firstNode.next = secondNode;
            return firstNode;
        }
    }

}
