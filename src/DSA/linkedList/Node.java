package linkedList;

import java.util.HashSet;

class MyLinkedList {

    public static class Node {

        int data;
        Node next;
        Node down;

        public Node(int data) {

            this.data = data;
            this.next = null;
            this.down = null;
        }
    }

    Node head;
    Node tail;

    public void add(int data ) {

        Node node = new Node(data);

        if (head == null) {
            head = tail = node;
        }

        tail.next = node;
        tail = node;
    }



    public void  print() {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data+" ");
        }

        return;
    }
}




