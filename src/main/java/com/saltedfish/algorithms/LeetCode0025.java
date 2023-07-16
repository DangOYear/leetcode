package com.saltedfish.algorithms;

import com.saltedfish.baseclass.ListNode;

/**
 * @author SaltedFish
 * @date 2021/3/8
 */
public class LeetCode0025 {
    class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode pre = dummy;

            while (head != null) {
                ListNode tail = pre;
                for (int i = 0; i < k; ++i) {
                    tail = tail.next;
                    if (tail == null) {
                        return dummy.next;
                    }
                }

                ListNode nextGroupHead = tail.next;
                ListNode[] reverse = reverseLinkedList(head, tail);
                head = reverse[0];
                tail = reverse[1];

                pre.next = head;
                tail.next = nextGroupHead;
                pre = tail;
                head = nextGroupHead;
            }
            return dummy.next;
        }

        private ListNode[] reverseLinkedList(ListNode head, ListNode tail) {
            ListNode pre = tail.next;
            ListNode p = head;
            while (pre != tail) {
                ListNode next = p.next;
                p.next = pre;
                pre = p;
                p = next;
            }
            return new ListNode[]{tail, head};
        }
    }
}
