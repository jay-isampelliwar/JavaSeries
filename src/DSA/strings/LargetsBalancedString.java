package strings;

public class LargetsBalancedString {

    public static void main(String args []) {

        String s = "[]{}]";

        int roundBracketOpen = 0, roundBracketClose = 0;
        int squareBracketOpen = 0, squareBracketClose = 0;
        int curlyBracketOpen = 0, curlyBracketClose = 0;

        for (int i = 0; i < s.length(); i++) {

            switch (s.charAt(i)) {

                case ')':
                    roundBracketClose++;
                    break;
                case '(':
                    roundBracketOpen++;
                    break;
                case ']':
                    squareBracketClose++;
                    break;
                case '[':
                    squareBracketOpen++;
                    break;
                case '}':
                    curlyBracketClose++;
                    break;
                case '{':
                    curlyBracketOpen++;
                    break;
                default:
                    break;
            }
        }

        int res = Math.min(roundBracketClose , roundBracketOpen)
                + Math.min(squareBracketClose, squareBracketOpen)
                + Math.min(curlyBracketClose , curlyBracketOpen);

        System.out.println(res*2);
    }
}

