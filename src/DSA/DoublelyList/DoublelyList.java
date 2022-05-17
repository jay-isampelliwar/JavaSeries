package DoublelyList;

public class DoublelyList {

    class Node {

        int data;
        Node next;
        Node prev;

        public Node(int data) {

            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    Node tail;

    public void add(int data) {

        Node node = new Node(data);

        if(tail == null) {
            head = node;
            tail = node;
            return;
        }

        node.prev = tail;
        tail.next = node;
        tail = node;

        return;

    }

    public void reverseList() {

        Node cur = head;
        Node prv = null;
        Node next = head;

        while (next != null) {

            cur = next;
            cur.prev = cur.next;
            cur.next = prv;
            next = cur.prev;
            prv = cur;

        }

        return;
    }

    public void print() {

        if (tail == null) return;

        Node temp = tail;

        while(temp != null) {

            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
        return;
    }

    public void printFormTail() {

        Node temp = head;

        while(temp != null) {

            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
        return;
    }
}
