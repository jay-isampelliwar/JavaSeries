package stack;

public class JStack <E> {

    static class Node <E> {

        E data;
        Node next;

        private Node(E data) {

            this.data = data;
            this.next = null;
        }
    }

    Node head;
    private int size;

    public JStack() {

        head = null;
        size = 0;
    }

    public void push (E data) {

        Node newNode = new Node(data);

        newNode.next = head;
        size++;
        head = newNode;

    }

    public E pop () throws  Exception {

        if( head == null ) throw  new Exception("Underflow Condition");

        Node res = head;
        head = head.next;
        size--;

        return (E) res.data;
    }

    public E peek() throws Exception {

        if( head == null ) throw  new Exception("Underflow Condition");

        return (E) head.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void display() {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}