package com.saltedfish.codinginterviews;

import com.saltedfish.baseclass.ListNode;

import java.util.List;

public class CI0022 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode getKthFromEnd(ListNode head, int k) {
            ListNode pri = head;
            while (--k >= 0) {
                pri = pri.next;

            }

            while (pri != null) {
                pri = pri.next;
                head = head.next;
            }
            return head;
        }
    }
}
