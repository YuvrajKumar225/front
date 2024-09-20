package LinkedList;

import java.util.HashSet;

public class RemoveDupdlicateFromUnsortedList {

    private static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
    static Node head;
    static Node tail;
    static int size = 0;

    private static void removeDupdlicateFromUnsortedList(Node head) {
        if (head == null || head.next == null) {
            return;
        }

        HashSet<Integer> set = new HashSet<>();
        Node current = head;
        set.add(current.val);

        while (current.next != null) {
            if (set.contains(current.next.val)) {
                current.next = current.next.next;
                size--;
            } else {
                set.add(current.next.val);
                current = current.next;
            }
        }

        // Update the tail
        tail = current;
    }

    public static void insertLast(int val) {
        Node node = new Node(val);

        if (tail == null) {
            // List is empty
            head = node;
            tail = node;
        } else {
            // List is not empty
            tail.next = node;
            tail = node;
        }

        size++;
    }

    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        insertLast(12);
        insertLast(11);
        insertLast(12);
        insertLast(21);
        insertLast(41);
        insertLast(43);
        insertLast(21);

        System.out.println("Original list:");
        display();

        removeDupdlicateFromUnsortedList(head);

        System.out.println("List after removing duplicates:");
        display();
    }
}
