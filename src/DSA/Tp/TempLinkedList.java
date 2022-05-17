package Tp;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TempLinkedList <E>{

    public static class Node <E>{

        E data;
        Node next;

        Node(E data) {

            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void add(E e) {

        Node<E> node = new Node(e);
        Node<E> temp =head;

        if(head == null) {

            head = node;
            return;
        }
        else  {

            while (temp.next != null) {

                temp = temp.next;
            }

            temp.next = node;
        }

    }

    public static void print(Node head) {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static void main(String args []) {

        TempLinkedList<Integer> l1 = new TempLinkedList<>();
        TempLinkedList<Integer> l2 = new TempLinkedList<>();
        HashSet<Object> set = new HashSet<>();

        l1.add(1);
        l1.add(2);
        l1.add(4);
        l1.add(4);
        l1.add(21);
        l1.add(36);
        l1.add(88);
        l2.add(67);
        l2.add(89);
        l2.add(90);
        l2.add(99);
        l2.add(100);
        l2.add(100);

        Node head1 = l1.head;
        Node head2 = l2.head;

        Node t1 = head1;
        Node t2 = head2;

        while (t1 != null) {

            set.add(t1.data);
            t1 = t1.next;
        }
        while (t2 != null) {

            set.add(t2.data);
            t2 = t2.next;
        }

        Node head3 = null;

        Iterator<Object> iterator = set.iterator();



             while (iterator.hasNext()) {

            Node node = new Node(iterator.next());
            Node t3 = head3;

            if (head3 == null) {

                head3 = node;
                continue;
            }

            else {


                while (t3.next != null) {

                    t3 = t3.next;
                }

                t3.next = node;
            }
        }

        print(head3);
    }

}
