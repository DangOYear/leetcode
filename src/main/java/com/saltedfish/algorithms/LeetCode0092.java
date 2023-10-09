package com.saltedfish.algorithms;

import com.saltedfish.baseclass.ListNode;

public class LeetCode0092 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {

        void reverseList(ListNode head) {
            ListNode pre = null;
            ListNode cur = head;
            while (cur != null) {
                ListNode next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }
        }

        public ListNode reverseBetween(ListNode head, int left, int right) {
            ListNode dummy = new ListNode(-1);
            dummy.next = head;

            ListNode pre = dummy;

            for (int i = 0; i < (left - 1); i++) {
                pre = pre.next;
            }

            ListNode next = pre;

            for (int i = 0; i < (right - left + 1); i++) {
                next = next.next;
            }

            ListNode leftNode = pre.next;
            ListNode rightNode = next.next;

            pre.next = null;
            next.next = null;

            reverseList(leftNode);

            pre.next = next;
            leftNode.next = rightNode;
            return dummy.next;

        }
    }
}
