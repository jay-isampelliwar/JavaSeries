package strings;

import java.util.Stack;

public class ReverseStringWordByWord {

    public static void main(String args []) {


        String str = "fuck you all my haters";
        Stack<String> st = new Stack<>();
        String ans = "";
        String temp = "";

        for(int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {

                temp += str.charAt(i);
            }
            else {

                st.push(temp);
                st.push(Character.toString(str.charAt(i)));
                temp = "";
            }
        }

        st.push(temp);

        while (!st.empty()) ans += st.pop();

        System.out.println(ans);
    }
}
