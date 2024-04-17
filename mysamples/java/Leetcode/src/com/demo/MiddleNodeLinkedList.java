
package com.demo;

//Problem Statement:https://leetcode.com/problems/reverse-linked-list/
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MiddleNodeLinkedList {

    public static ListNode findMiddleNode(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        // Example 1
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        System.out.print("Example 1: ");
        printList(findMiddleNode(head1));

        // Example 2
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);
        head2.next.next.next.next.next = new ListNode(6);
        System.out.print("Example 2: ");
        printList(findMiddleNode(head2));
    }

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(", ");
            }
            head = head.next;
        }
        System.out.println();
    }
}

