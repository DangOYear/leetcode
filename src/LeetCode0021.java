package src;


import baseclass.ListNode;

public class LeetCode0021 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode dummy = new ListNode(0);
            ListNode head = dummy;
            ListNode p = l1;
            ListNode q = l2;
            while (p != null && q != null) {
                if (p.val < q.val) {
                    head.next = p;
                    p = p.next;
                    head = head.next;
                }else {
                    head.next = q;
                    q = q.next;
                    head = head.next;
                }
            }

            while (p != null) {
                head.next = p;
                p = p.next;
                head = head.next;
            }

            while (q != null) {
                head.next = q;
                q = q.next;
                head = head.next;
            }
            return dummy.next;
        }
    }
}
