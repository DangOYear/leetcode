package com.saltedfish.baseclass;

import java.util.List;

/**
 * @author SaltedFish
 * @date 2021/2/12
 */
public class OutputUtils {
    public static void printIntArrary(int[] nums) {
        System.out.println("The Int Array");
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i != nums.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }

    public static void printListNode(ListNode head) {
        System.out.println("链表");
        System.out.print("[");
        while (head != null) {
            System.out.print(head.val + ",");
            head = head.next;
        }
        System.out.print("]");
    }
}
