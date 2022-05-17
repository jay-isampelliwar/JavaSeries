package linkedList;

public class Palindrome {

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
    public boolean checkPalindrome() {

        if(head == null || head.next == null) return true;

        Node newHead = head;
        Node mid = getMid(head);
        Node last = reverse(mid.next);


        while (last != null) {

            if (last.data != newHead.data) return false;

            last = last.next;
            newHead = newHead.next;

        }

        return true;
    }

    public static Node getMid(Node node) {

        Node slow = node;
        Node fast = node;

        while(fast.next != null && fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public Node reverse(Node node) {

        Node current = node;
        Node prv = null;

        while( current != null) {

            Node temp = current.next;

            current.next = prv;
            prv = current;

            current = temp;
        }

        return prv;
    }
}
