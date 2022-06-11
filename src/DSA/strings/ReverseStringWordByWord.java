package DSA.strings;

import java.util.Stack;

public class ReverseStringWordByWord {

    public static void main(String args []) {

        String str = "a3b4q2i3 abcd2 a4bc";
//        String str = "fuck you all my haters";
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

//        System.out.println(ans);

        String res = "";
        char prv = '\0';
        for(int i = 0; i < ans.length(); i++) {

            char c = ans.charAt(i);
            if(c >= '1' && c <= '9') {
                int r = (int) c - '0';
                for(int k = 1; k < r; k++) {

                    res += prv;
                }
            }
            else {
                res += c;
            }
            prv = c;
        }

        System.out.println(res);
    }

}
