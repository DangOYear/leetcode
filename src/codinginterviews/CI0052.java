package src.codinginterviews;

import src.algorithms.baseclass.ListNode;


/**
 *
 * https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/
 *
 * 剑指 Offer 52. 两个链表的第一个公共节点
 *
 * 输入两个链表，找出它们的第一个公共节点。
 */

public class CI0052 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode pA = headA;
            ListNode pB = headB;
            int lengthA = 0;
            int lengthB = 0;
            while (pA != null) {
                ++lengthA;
                pA = pA.next;
            }
            while (pB != null) {
                ++lengthB;
                pB = pB.next;
            }
            pA = headA;
            pB = headB;
            if (lengthA < lengthB) {
                ListNode temp = pA;
                pA = pB;
                pB = temp;
            }


            for (int i = Math.abs(lengthA - lengthB); i > 0; --i) {
                pA = pA.next;
            }

            while (pA != pB && (pA != null) && (pB != null)) {
                pA = pA.next;
                pB = pB.next;
            }
            if (pA == pB && pA != null) {
                return pA;
            } else {
                return null;
            }
        }
    }
}
