package com.saltedfish.crackingthecodinginterview;

import src.algorithms.baseclass.ListNode;

import java.util.List;

public class CTCI0204 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode partition(ListNode head, int x) {

            ListNode less = new ListNode(0);
            ListNode greater = new ListNode(0);

            while (head != null) {
                ListNode next = head.next;
                if (head.val < x) {
                    head.next = less.next;
                    less.next = head;
                }else {
                    head.next = greater.next;
                    greater.next = head;
                }
                head = next;
            }
            ListNode lessEnd = less;
            while (lessEnd.next != null) {
                lessEnd = lessEnd.next;
            }
            lessEnd.next = greater.next;
            return less.next;
        }
    }
}
