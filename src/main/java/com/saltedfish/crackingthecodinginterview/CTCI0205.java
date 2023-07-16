package com.saltedfish.crackingthecodinginterview;


import com.saltedfish.baseclass.ListNode;

public class CTCI0205 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode cursor1 = l1;
            ListNode cursor2 = l2;

            ListNode dummy = new ListNode(0);
            ListNode cursorRes = dummy;

            int carry = 0;
            while (cursor1 != null && cursor2 != null) {
                int val = cursor1.val + cursor2.val + carry;
                carry = val / 10;
                val %= 10;
                cursorRes.next = new ListNode(val);
                cursorRes = cursorRes.next;
                cursor1 = cursor1.next;
                cursor2 = cursor2.next;
            }

            if (cursor1 == null) {
                while (cursor2 != null) {
                    int val = cursor2.val + carry;
                    carry = val / 10;
                    val %= 10;
                    cursorRes.next = new ListNode(val);
                    cursorRes = cursorRes.next;
                    cursor2 = cursor2.next;
                }
            } else {
                while (cursor1 != null) {
                    int val = cursor1.val + carry;
                    carry = val / 10;
                    val %= 10;
                    cursorRes.next = new ListNode(val);
                    cursorRes = cursorRes.next;
                    cursor1 = cursor1.next;
                }
            }

            if (carry >= 1) {
                cursorRes.next = new ListNode(1);
            }
            return dummy.next;
        }
    }
}
