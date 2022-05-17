package strings;

import java.util.Stack;

public class BalancedString {

    public static void main(String args[]) {

        Stack stack = new Stack();

        String brackets = "(()){{}}{{}}[][][][][][]";

        char n = '\0';
        char p = '\0';
        boolean f = false;

        for (int i = 0; i < brackets.length(); i++) {

            if (brackets.charAt(i) == '(' || brackets.charAt(i) == '{' || brackets.charAt(i) == '[') {

                stack.push(brackets.charAt(i));
            } else {

                if (stack.empty()){

                    f = false;
                    break;
                }

                n = brackets.charAt(i);
                p = (char) stack.pop();

                if (n == ')') f = p == n - 1 ? true : false;
                else f = p == n - 2 ? true : false;
            }

            if (!f) break;
        }

        if (stack.empty()) System.out.println("Bal");
        else System.out.println("Not Bal");



    }
}
