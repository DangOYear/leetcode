package com.saltedfish.crackingthecodinginterview;

import com.saltedfish.baseclass.ListNode;

/**
 * @author SaltedFish
 * @date 2021/6/2
 */
public class CTCI0207 {
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode cur1 = headA;
            ListNode cur2 = headB;

            while (cur1 != cur2) {
                cur1 = cur1 != null ? cur1.next : headB;
                cur2 = cur2 != null ? cur2.next : headA;
            }
            return cur1;
        }
    }
}
