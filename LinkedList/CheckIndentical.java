package LinkedList;

public class CheckIndentical {
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    Node head;
    Node tail;
    static int size = 0;

    public static boolean checkIndentical(Node list1, Node list2) {
        Node temp1 = list1;
        Node temp2 = list2;
        while (temp1 != null && temp2 != null) {
            if (temp1.val != temp2.val) {
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1 == null && temp2 == null;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size = size + 1;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        CheckIndentical list1 = new CheckIndentical();
        CheckIndentical list2 = new CheckIndentical();
        list1.insertFirst(1);
        list1.insertFirst(2);
        list1.insertFirst(3);
        list1.insertFirst(4);
        list1.insertFirst(5);
        list1.insertFirst(6);
        list1.insertFirst(7);
        list1.insertFirst(8);
        list1.insertFirst(9);
        list1.insertFirst(10);
        list2.insertFirst(1);
        list2.insertFirst(2);
        list2.insertFirst(3);
        list2.insertFirst(4);
        list2.insertFirst(5);
        list2.insertFirst(6);
        list2.insertFirst(7);
        list2.insertFirst(8);
        list2.insertFirst(9);
        list2.insertFirst(10);
        list1.display();
        list2.display();
        System.out.println(checkIndentical(list1.head, list2.head));
    }
}
