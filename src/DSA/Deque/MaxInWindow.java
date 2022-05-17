package Deque;

import java.util.ArrayDeque;

public class MaxInWindow {

    public static void main(String[] args) {

        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int n = arr.length;
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        int i;
        for(i = 0; i < k; i++) {

            while( !deque.isEmpty() && arr[i] > arr[deque.peekLast()]) deque.pollLast();
            deque.addFirst(i);
        }

        for (; i < n ; i++) {

            System.out.print(arr[deque.peekLast()]+" ");

            if(i - arr[deque.pollLast()] > k) deque.pollLast();
            while (!deque.isEmpty() && arr[i] > arr[deque.peekLast()]) deque.pollLast();

            deque.addFirst(i);
        }
     }
}
