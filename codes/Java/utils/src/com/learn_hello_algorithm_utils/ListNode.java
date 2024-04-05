package com.learn_hello_algorithm_utils;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    /* 将列表反序列化为链表 */
    public static ListNode arrToLinkedList(int[] arr) {
        ListNode dum = new ListNode(0);
        ListNode head = dum;
        for (int val : arr) {
            head.next = new ListNode(val);
            head = head.next;
        }
        return dum.next;
    }
}
