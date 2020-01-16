package src.algorithms;

import src.algorithms.baseclass.ListNode;

public class LeetCode0142 {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            if (head == null || head.next == null)
                return null;

            ListNode slow = head, fast = head.next;
            while (slow != fast) {
                if (fast == null || fast.next == null)
                    return null;
                slow = slow.next;
                fast = fast.next.next;
            }
            ListNode find = new ListNode(0);
            find.next = head;

            while (find.next != slow) {
                find = find.next;
            }


            return find;
        }
    }
}
