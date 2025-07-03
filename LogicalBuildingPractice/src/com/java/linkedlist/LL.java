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

    public static void reverseList(LL list) {
        Node prev = null;
        Node present = list.head;
        Node nextNode = present.next;

        list.tail = list.head;
        while(present != null){
            present.next = prev;
            prev = present;
            present = nextNode;
            if(nextNode != null){
                nextNode = nextNode.next;
            }
        }
        list.head = prev;
    }

    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value+ "->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[] args) {
        LL ll = new LL();
        ll.insertFirst(5);
        ll.insertFirst(2);
        ll.insertLast(1);
        ll.insertFirst(4);
        ll.insertFirst(7);
        ll.printLL();
        reverseList(ll);
        System.out.println();
        ll.printLL();
    }
}
