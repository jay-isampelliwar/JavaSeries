package stack;
import javafx.geometry.Pos;

import java.util.Stack;

public class InfixToPostfix {

    public static void main(String args []) {

        String Ex = "a+b*(c^d-e)^(f+g*h)-i";
        Stack<Character> st = new Stack<>();
        String Postfix = "";

        for(int i = 0; i < Ex.length(); i++) {

            char cur = Ex.charAt(i);

            if(cur >= 'a' && cur <= 'z') {

                Postfix += cur;
            }
            else if (isOperator(cur)) {

                if (st.isEmpty()) {
                    st.push(cur);
                    continue;
                }

                if(st.peek() == '(') {
                    st.push(cur);
                    continue;
                }

                if (priority(st.peek()) < priority(cur)) {
                    st.push(cur);
                }
                else if(priority(st.peek()) >= priority(cur)) {

                    while (!st.isEmpty() && priority(st.peek()) >= priority(cur)) {
                        Postfix += st.pop();
                    }

                    st.push(cur);
                }
            }
            else if(cur == ')'){

                while (!st.isEmpty() && st.peek() != '(') {
                    Postfix += st.pop();
                }

                st.pop();
            }
            else {

                st.push(cur);
            }


        }

        while (!st.isEmpty()) Postfix += st.pop();

        System.out.println(Postfix);

    }

    public static boolean isOperator(char c) {

        return  c == '-' || c == '+' ||
                c == '*' || c == '/' ||
                c == '^';
        }
    public static int priority(char c) {

        switch (c) {

            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
        }

        return 0;
    }
}
