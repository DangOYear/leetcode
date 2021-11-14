package com.saltedfish.algorithms;

import com.saltedfish.baseclass.ListNode;
import com.saltedfish.baseclass.OutputUtils;

import java.util.List;

/**
 * @author SaltedFish
 * @date 2021/11/14
 */
public class LeetCode5927 {
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

        public ListNode[] reverse(ListNode head, ListNode tail) {
            ListNode prev = tail.next;
            ListNode p = head;
            while (prev != tail) {
                ListNode nextNode = p.next;
                p.next = prev;
                prev = p;
                p = nextNode;
            }
            return new ListNode[]{tail, head};

        }

        public ListNode reverseEvenLengthGroups(ListNode head) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode pre = dummy;
            int count = 1;
            while (head != null) {
                ListNode tail = pre;

                int segCount = 0;
                for (int i = 0; i < count && tail.next != null; i++) {
                    tail = tail.next;
                    segCount++;
                }

                boolean needReverse = (segCount % 2 == 0);

                if (!needReverse) {
                    pre = tail;
                    head = tail.next;
                } else {
                    ListNode nextSeg = tail.next;
                    ListNode[] reverse = reverse(head, tail);
                    head = reverse[0];
                    tail = reverse[1];

                    pre.next = head;
                    tail.next = nextSeg;
                    pre = tail;
                    head = tail.next;
                }

                count++;

            }
            return dummy.next;
        }
    }

    public static void main(String[] args) {
        LeetCode5927.Solution solution = new LeetCode5927().new Solution();
        ListNode head = new ListNode(0);
        head.next = new ListNode(4);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(3);
//        head.next.next.next.next.next = new ListNode(1);
//        head.next.next.next.next.next.next = new ListNode(7);
//        head.next.next.next.next.next.next.next = new ListNode(3);
//        head.next.next.next.next.next.next.next.next = new ListNode(8);
        OutputUtils.printListNode(solution.reverseEvenLengthGroups(head));
    }
}
