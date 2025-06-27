package com.java.linkedlist;

public class LL {
    Node head;
    Node tail;
    int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        if (head == null) {
            head = tail;
        }
    }

    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LL ll = new LL();
        ll.insertFirst(5);
        ll.insertFirst(2);
        ll.insertLast(1);
        ll.printLL();
    }
}
