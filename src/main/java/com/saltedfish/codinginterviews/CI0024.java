package com.saltedfish.codinginterviews;

import com.saltedfish.baseclass.ListNode;

public class CI0024 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode cur = null;
            ListNode pre = head;
            while (pre != null) {
                ListNode next = pre.next;
                pre.next = cur;
                cur = pre;
                pre = next;
            }
            return cur;
        }
    }
}
