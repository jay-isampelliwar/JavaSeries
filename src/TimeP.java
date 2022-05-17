import java.util.ArrayDeque;
import java.util.Deque;

public class TimeP {

    public static void main(String[] args) {

        int a[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 1;
        int n = a.length;

        Deque<Integer> q = new ArrayDeque<Integer>();

        int i = 0;
        for (; i < k; i++) {

            if (q.isEmpty()) {

                q.addLast(i);
                continue;
            }

            if (a[q.peekLast()] > 0 && a[i] < 0) {

                q.pollLast();
                q.addLast(i);
            } else if (a[q.peekLast()] < 0 && a[i] < 0) {
                q.addLast(i);
            } else {
                q.addLast(i);
            }
        }

        int p = 0;

        if (q.peekLast() - q.peekFirst() < k - 1) {

            p = a[q.peekFirst()];

            if (p < 0)System.out.print(p + " ");
            else System.out.print(0+" ");

        } else {

            p = a[q.pollFirst()];

            if (p < 0)System.out.print(p + " ");
            else System.out.print(0+" ");
        }

        for (; i < n; i++) {

            if (a[q.peekLast()] > 0 && a[i] < 0) {

                q.pollLast();
                q.addLast(i);
            } else if (a[q.peekLast()] < 0 && a[i] < 0) {
                q.addLast(i);
            } else {
                q.addLast(i);
            }

            if (q.peekLast() - q.peekFirst() < k - 1) {

                p = a[q.peekFirst()];

                if (p < 0)System.out.print(p + " ");
                else System.out.print(0+" ");

            } else {

                p = a[q.pollFirst()];

                if (p < 0)System.out.print(p + " ");
                else System.out.print(0+" ");
            }
        }
    }


}

