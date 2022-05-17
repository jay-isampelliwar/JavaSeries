package Heap;

import java.util.*;

public class NearlySorted {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int val = sc.nextInt();
            list.add(val);
        }

        PriorityQueue<Integer> q = new PriorityQueue<>(list.subList(0 , k));

        int index = 0;

        for (int i = k; i < n; i++) {

            list.set(index++ , q.poll());
            q.offer(list.get(i));
        }

        while(!q.isEmpty()) {

            list.set(index++ , q.poll());
        }

        System.out.println(list);
    }
}
