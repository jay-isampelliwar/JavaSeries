package linkedList;

import java.util.Scanner;

public class RemoveCycle {

    static Scanner sc;
    Node head;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        RemoveCycle r = new RemoveCycle();
        System.out.println("Enter element for linkedlist : ");
        Node head = r.createList();
        r.createLoop(head , 4);
        Solution1 s = new Solution1();

        System.out.println("'"+s.getLoopEle(head)+"'");
        r.print(head);

    }

    public Node createList() {

        Node head = null;
        Node tail = null;
        while (true) {

            int data = sc.nextInt();

            if (data == -1) break;

            Node newNode= new Node(data);

            if (head == null) {

                head = newNode;
                tail = newNode;
            }
            else {

                tail.next = newNode;
                tail = tail.next;
            }
        }

        return head;
    }

    public void createLoop(Node head , int index) {

        Node temp1 = head;
        Node temp2 = head;

        while (temp1.next != null) temp1 = temp1.next;

        for (int i = 1; i < index; i++) {

            temp2 = temp2.next;
        }

        temp1.next = temp2;

        return;
    }

    public void print(Node head) {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
class Node {

    int data;
    Node next;
    Node down;

    public Node(int data) {

        this.data = data;
        this.next = null;
        this.down = null;
    }
}
class Solution1 {

    public int getLoopEle(Node head) {

        if (head == null) return -1;

        Node meet = detectLoop(head);

        if (meet == null) return -1;

        Node start = head;
        Node end = meet;

        if (head == end && head == meet) {

            Node temp = head;

            while (temp.next != head) {

                temp = temp.next;
            }

            end = temp;
            end.next = null;
            return start.data;

        }

        while (start.next != end.next) {

            start = start.next;
            end = end.next;
        }

        end.next = null;
        return start.next.data;
    }

    public Node detectLoop(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {

            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {

                return slow;
            }
        }
        return null;
    }
}
