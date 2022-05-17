package Deque;

import java.util.ArrayDeque;

public class FirstNegativeEle {

    public static void main(String[] args) {

//        int[] arr = {95 ,352 ,89, -94 ,-942 ,327 ,-458};
        int[] arr = {-8, 2, 3, -6, 10};
//        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int n = arr.length;
        int k = 3;

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        int i = 0;

        for(; i < k; i++) {
            if(arr[i] < 0) {
                deque.addFirst(i);
            }
        }

        for (; i < n; i++) {

            if(!deque.isEmpty()) System.out.print(arr[deque.peekLast()]+" ");
            else System.out.print(0+" ");

            if (deque.isEmpty() && arr[i] < 0) {
                deque.addFirst(i);
            }
            else {

                if(!deque.isEmpty() && i - deque.peekLast() >= k) {
                    deque.pollLast();
                }

                if (arr[i] < 0) {
                    deque.addFirst(i);
                }
            }


        }

        if(!deque.isEmpty()) System.out.print(arr[deque.peekLast()]+" ");
        else System.out.print(0+" ");
    }
}
