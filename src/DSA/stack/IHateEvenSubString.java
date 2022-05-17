package stack;

import java.util.Stack;

public class IHateEvenSubString {

    public static void main (String args []) {

        String s = "1010101001010000111010111110101010101000011101011000000000101010101010101010101010101010000000000110000010010110100101010101010101101000000111111001011010100000000001000000000010000000010000000010000000000100000000101";

        Stack<Character> stack = new Stack();



        char p =  stack.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {

            char n = s.charAt(i);

            if (p != n) {

                p = stack.push(n);
            }
            else {

                stack.pop();
                if (!stack.empty())
                    p = stack.peek();
            }
        }

        String ans = "";
        String newAns = "";
        while (!stack.empty()) {

            ans += stack.pop();
        }

        if (ans.isEmpty()) System.out.println("KHALLI");
        else {

            for (int i = ans.length()-1; i >= 0; i--) {

                newAns = newAns + ans.charAt(i);
            }

            System.out.println(newAns);
        }
    }
}
