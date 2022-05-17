package Deque;

public class MyDeque<E> {

    public static class Node<E> {

        E data;
        Node<E> next , prev;

        public Node(E data){

            this.data = data;
            this.next = this.prev = null;
        }
    }

    Node<E> head , tail;

    public void addF(E data) {

        Node<E> newNode = new Node<>(data);

        if ( head == null) {

            head = tail = newNode;
            return;
        }

        head.next = newNode;
        newNode.prev = head;
        head = newNode;
    }

    public E pollF() {

        if (head == null )
            return  null;

        Node<E> temp = head;
        head = head.prev;
        temp.prev = null;

        if(head == null) {
            tail = null;
        }

        return  temp.data;
    }

    public E peekF() {

        if(head == null)
            return null;
        else
            return head.data;
    }


    public void addL(E data) {

        Node<E> newNode = new Node<>(data);

        if ( tail == null) {

            head = tail = newNode;
            return;
        }

        tail.prev = newNode;
        newNode.next = tail;
        tail = newNode;
    }

    public E pollL() {

        if (tail == null )
            return  null;

        Node<E> temp = tail;
        tail = tail.next;
        temp.next = null;

        if(tail == null) {
            head = null;
        }

        return temp.data;
    }

    public E peekL() {

        if(tail == null)
            return null;
        else
            return tail.data;
    }

}
