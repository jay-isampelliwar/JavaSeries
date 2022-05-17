package strings;

import java.util.Scanner;
import java.util.Stack;

public class RemoveConsecutiveChar {

    public static void main(String args[]) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String S = scanner.next();
        String str = "";
        int n = S.length();

        for(int i = n-1; i >=0 ; i--) str += S.charAt(i);


        Stack<Character> st = new Stack<>();

        char c = '\0';

         st.push(str.charAt(0));

        for(int i = 1; i < n; i++) {

            c = str.charAt(i);

            if(st.peek() != c) {

                st.push(c);
            }
        }


        str = "";
        while (!st.empty()) {

            str += st.pop();
        }
//        while (i < n) {
//
//            str += S.charAt(i);
//
//            int j = i + 1;
//
//            while (S.charAt(i) == S.charAt(j)) {
//
//                j++;
//
//                if (j == n) break;
//            }
//
//            i = j;
//        }

        System.out.println(str);
    }
}
