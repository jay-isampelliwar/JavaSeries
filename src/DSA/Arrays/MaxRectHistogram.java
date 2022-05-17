package Arrays;
import java.util.Stack;

public class MaxRectHistogram {

    public static void main(String[] args) {

        int my [] = {6,2,5,4,5,1,6};
        int n = my.length;
        System.out.println(getMaxArea(my , n));
    }

    public static int getMaxArea(int hist[], int n) {

        if(n == 1) {
            return hist[0];
        }

        int ps [];
        int ns [];

        ps = previousSmall(hist , n);
        ns = nextSmall(hist , n);
        int maxArea = 0;

        for(int i = 0; i < n; i++) {

            int cur = (ns[i] - ps[i] - 1) * hist[i];
            maxArea = Math.max(maxArea , cur);
        }

        return maxArea;

    }

    public static int[] previousSmall(int a[] , int n) {

        Stack<Integer> st = new Stack<>();

        int newArr[] = new int[n];

        for(int i = 0; i < n; i++) {

            while(!st.isEmpty() && a[i] < a[st.peek()]) st.pop();

            if(st.isEmpty()) {

                newArr[i] = -1;
            }
            else {

                newArr[i] = st.peek();
            }

            st.push(i);
        }

        return newArr;
    }

    public static int[] nextSmall(int a[] , int n) {

        Stack<Integer> st = new Stack<>();

        int newArr[] = new int[n];

        for(int i = (int) n-1; i >= 0; i--) {

            while(!st.isEmpty() && a[i] < a[st.peek()]) st.pop();

            if(st.isEmpty()) {

                newArr[i] = n;
            }
            else {

                newArr[i] = st.peek();
            }

            st.push(i);
        }

        return newArr;
    }
}
