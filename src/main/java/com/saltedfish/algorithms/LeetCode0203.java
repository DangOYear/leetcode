package com.saltedfish.algorithms;


import com.saltedfish.baseclass.ListNode;

public class LeetCode0203 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode dummy = new ListNode(0);
            ListNode op = dummy;
            dummy.next = head;
            while (op.next != null) {
                if (op.next.val == val) {
                    op.next = op.next.next;
                }else {
                    op = op.next;
                }
            }
            return dummy.next;
        }
    }
}
