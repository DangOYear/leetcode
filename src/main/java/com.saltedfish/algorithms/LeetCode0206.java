package com.saltedfish.algorithms;

import src.algorithms.baseclass.ListNode;

public class LeetCode0206 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    //第一种解法
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;

            while (curr != null) {
                ListNode nextTemp = curr.next;
                curr.next = prev;
                prev = curr;

                curr = nextTemp;

            }
            return prev;
        }
    }



}
