package stack;

public class Main {

    public static void main(String args []) throws Exception {

       String str = "{((()))}";

        System.out.println(isBalanced(str));
    }

    public static boolean isBalanced(String str) throws Exception {

        JStack<Character> j = new JStack<>();

        int n = str.length();

        for(int i = 0; i < n; i++) {

            char c = str.charAt(i);

            if(isOpen(c)) {
                j.push(c);
            }
            else {

                if (j.isEmpty()) {

                    return false;
                }
                else if(!isMatching(j.peek() , c)) {

                    return  false;
                }
                else {

                    j.pop();
                }
            }

        }

        return j.isEmpty();
    }


    public static boolean isOpen(char c) {

        return c == '(' || c == '{' || c == '[';
    }

    public static boolean isMatching(char c1 , char c2) {

        return (c1 == '(' && c2 == ')') ||

                (c1 == '[' && c2 == ']') ||

                (c1 == '{' && c2 == '}');

    }

    }