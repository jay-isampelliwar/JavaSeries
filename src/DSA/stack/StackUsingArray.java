package stack;

public class StackUsingArray {

    private int capacity;
    private int stack[];
    private int top;
    private int min;
    private int max;

    public StackUsingArray(int size) {

        capacity = size;
        stack = new int[size];
        top = -1;
        min = 0;
        max = 0;
    }

    protected void push(int data) {

        if (isFull()) {
            System.out.println("your stack is full");
            System.exit(1);
        }
        top++;
        stack[top] = data;

    }

    protected int  pop() {

        if (isEmpty()) {
            System.out.println("your stack is empty");
            System.exit(1);
        }

        int popedEle = stack[top];
        top--;

        return popedEle;
    }

    protected int peek() {

        if (isEmpty()) {
            System.out.println("your stack is empty");
        }

        return stack[top];
    }

    protected void traverse() {

        for (int i = 0; i <= top; i++) {

            System.out.print(stack[i]+" ");
        }
    }

    protected boolean isEmpty() {
        return top == -1;
    }
    protected boolean isFull() {
        return top == capacity-1;
    }


    public static void main(String aegs[]) {

        StackUsingArray st = new StackUsingArray(5);

        st.push(44);
        st.push(24);
        st.push(53);
        st.push(12);
        st.push(21);

        st.pop();
        st.pop();

        st.peek();

        st.traverse();
    }

}
