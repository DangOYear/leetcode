package com.saltedfish.crackingthecodinginterview;

import com.saltedfish.baseclass.ListNode;

/**
 * @author SaltedFish
 * @date 2021/6/1
 */
public class CTCI0206 {
    class Solution {

        private ListNode getHalfListNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }

        private ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode cur = head;

            while (cur != null) {
                ListNode nextTemp = cur.next;
                cur.next = prev;
                prev = cur;
                cur = nextTemp;
            }

            return prev;
        }

        public boolean isPalindrome(ListNode head) {
            if (head == null) {
                return true;
            }

            ListNode halfListNodeEnd = getHalfListNode(head);

            ListNode halfListNodeStart = reverseList(halfListNodeEnd.next);

            ListNode p = head;
            ListNode q = halfListNodeStart;
            boolean res = true;
            while (res && q != null) {
                if (p.val != q.val) {
                    res = false;
                }
                p = p.next;
                q = q.next;
            }

            halfListNodeEnd.next = reverseList(halfListNodeStart);
            return res;
        }
    }
}
