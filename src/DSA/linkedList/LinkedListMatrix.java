package linkedList;

import java.util.Scanner;

public class LinkedListMatrix {

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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedListMatrix list = new LinkedListMatrix();
        LinkedListMatrix.Solution sn = list.new Solution();


        int n = sc.nextInt();

        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                arr[i][j] = sc.nextInt();
            }
        }

        print(sn.construct(arr , n));
    }


    class Solution{

        public Node construct(int arr[][] , int n) {

            Node head = new Node(arr[0][0]);
            Node temp1 = null;
            Node cur;
            Node temp2;

            for (int i = 0; i < n; i++) {

                Node newN = new Node(arr[i][0]);
                cur = newN;
                temp2 = newN;

                for (int j = 1; j < n; j++) {

                    int item = arr[i][j];
                    Node newNode = new Node(item);

                    if(i != 0) {

                        temp1.down = cur;
                        temp1 = temp1.next;
                        cur.next = newNode;
                        cur = newNode;
                    }
                    else {

                        cur.next = newNode;
                        cur = newNode;
                    }
                }

                temp1 = temp2;
            }

            return head;
        }
    }

    public static void print(Node point) {

        if(point == null) return;

        Node temp = point;

        while (temp != null) {

            System.out.println(temp.data+" ");
            temp = temp.next;
        }

        return;
    }

}


