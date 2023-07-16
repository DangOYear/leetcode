package com.saltedfish.crackingthecodinginterview;


import com.saltedfish.baseclass.ListNode;

import java.util.HashSet;
import java.util.Set;

public class CTCI0201 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode removeDuplicateNodes(ListNode head) {
            Set<Integer> set = new HashSet<>();
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode p = dummy;
            while (p.next != null) {
                if (set.contains(p.next.val)) {
                    p.next = p.next.next;
                } else {
                    set.add(p.next.val);
                    p = p.next;
                }
            }
            return dummy.next;
        }
    }
}
