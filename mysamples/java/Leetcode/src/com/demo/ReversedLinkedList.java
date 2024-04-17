package com.demo;

//Problem Statement: https://leetcode.com/problems/reverse-linked-list/

public class ReversedLinkedList {

    public static class Node {
        int data;
        Node next;
      

        Node(int d) {
            data = d;
            next = null;
            
        }
    }

    
    Node head;

    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
        	  
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    void printList(Node node) {
        while (node != null) {
        	  
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String arg[]) {
    	
        ReversedLinkedList list = new ReversedLinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        System.out.println("Given Linked list");
        list.printList(list.head);
        list.head = list.reverse(list.head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(list.head);
    }
}
