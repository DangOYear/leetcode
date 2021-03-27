package com.saltedfish.algorithms;

import com.saltedfish.baseclass.ListNode;

/**
 * @author SaltedFish
 * @date 2021/3/27
 */
public class LeetCode0061 {
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
        public ListNode rotateRight(ListNode head, int k) {
            if (head == null || head.next == null ||  k == 0) {
                return head;
            }
            int size = 1;
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
                size++;
            }
            int move = size - k % size;
            if (move == size) {
                return head;
            }
            temp.next = head;
            while (move > 0) {
                move--;
                temp = temp.next;
            }
            ListNode res = temp.next;
            temp.next = null;
            return res;
        }
    }
}
