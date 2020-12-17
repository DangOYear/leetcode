package com.saltedfish.codinginterviews;

import src.algorithms.baseclass.ListNode;

public class CI0018 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode deleteNode(ListNode head, int val) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode pre = dummy;
            while (head != null) {
                if (head.val == val) {
                    pre.next = head.next;
                    break;
                }
                pre = pre.next;
                head = head.next;
            }
            return dummy.next;
        }
    }
}
