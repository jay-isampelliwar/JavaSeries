package stack;

import java.util.*;

public class MinStack {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {

            int op = sc.nextInt();

            if(op == -1111) break;

            if(op == 1) {
                list.add(op);
                list.add(sc.nextInt());
            }
            else {
                list.add(op);
            }
        }
        // 1 push
        // 2 top
        // 3 pop
        // 4 getMIn

        for ( int i = 0; i < list.size() ; i++) {

            int cur = list.get(i);

            switch (cur) {
                case 1:
                    push(st , list.get(++i));

                    break;
                case 2:
                    System.out.print(top(st)+" ");
                    break;
                case 3:
                    System.out.print(pop(st)+" ");
                    break;
                case 4:
                    System.out.print(getMin()+" ");
            }
        }

    }

    static int min = Integer.MAX_VALUE;
    private static int getMin() {
        return min;
    }

    private static int top(Stack<Integer> st) {

        if (st.peek() < min) return min;

        return st.peek();
    }

    private static void push(Stack<Integer> st, int x) {

        if (st.empty()) {

            min = x;
            st.push(x);

        }
        else if(x < min) {

            int modi = (x * 2) - min;
            min = x;
            st.push(modi);
        }else {

            st.push(x);
        }
    }

    private static int pop(Stack<Integer> st) {

        if(st.peek() < min) {

            int prev = (min * 2) - st.peek();
            int temp = min;
            min = prev;
            st.pop();
            return temp;
        }

        return st.pop();
    }
}
