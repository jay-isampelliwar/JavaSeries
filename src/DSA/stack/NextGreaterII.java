package DSA.stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterII {

    public static void main(String[] args) {

        int[] nums = {-1, 0};
        int n = nums.length;
        int j = findMax(nums, n);
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        System.out.println(j);
        findNext(0, j, ans, st, nums);
        findNext(j + 1, n - 1, ans, st, nums);

        System.out.println(Arrays.toString(ans));
    }

    public static void findNext(int i, int j, int[] ans, Stack<Integer> st, int[] nums) {

        for (; i <= j; j--) {

            int ele = nums[j];

            if (st.isEmpty()) {

                st.push(ele);
                ans[j] = -1;
            } else {

                while (!st.isEmpty() && st.peek() <= ele) st.pop();

                if (st.isEmpty()) {
                    st.push(ele);
                    ans[j] = -1;
                } else {

                    ans[j] = st.peek();
                    st.push(ele);
                }
            }
        }
    }

    public static int findMax(int nums[], int n) {

        int j = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (nums[i] > max) {
                max = nums[i];
                j = i;
            }
        }

        System.out.println(max + " " + j);

        return j;
    }
}
