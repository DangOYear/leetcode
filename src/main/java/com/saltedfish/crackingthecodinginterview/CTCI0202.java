package com.saltedfish.crackingthecodinginterview;


import com.saltedfish.baseclass.ListNode;

public class CTCI0202 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public int kthToLast(ListNode head, int k) {
            ListNode pri = head;
            for (int i = 0; i < k; ++i) {
                pri = pri.next;
            }
            while (pri != null) {
                pri = pri.next;
                head = head.next;
            }
            return head.val;
        }
    }
}
