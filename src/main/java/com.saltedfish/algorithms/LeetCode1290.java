package com.saltedfish.algorithms;


import src.algorithms.baseclass.ListNode;


public class LeetCode1290 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public int getDecimalValue(ListNode head) {
            ListNode p = head;
            int res = 0;
            while (p != null) {
                res = res << 1;
                res += p.val;
                p = p.next;
            }
            return res;
        }
    }
}
