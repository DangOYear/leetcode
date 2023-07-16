package com.saltedfish.crackingthecodinginterview;

import com.saltedfish.baseclass.ListNode;

/**
 * @author SaltedFish
 * @date 2021/6/1
 */
public class CTCI0208 {
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            if (head == null) {
                return null;
            }

            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;

                fast = fast.next.next;


                if (fast == slow) {
                    ListNode p = head;
                    while (p != slow) {
                        p = p.next;
                        slow = slow.next;
                    }
                    return p;
                }
            }
            return null;
        }
    }
}
