package strings;

public class KeypadNumberChar {

    public static void main(String aegs []) {

        String S = "ILOVEYOU";
        S = S.toLowerCase();
        
        String ans = "";

        for (int i = 0; i < S.length(); i++) {

            ans += giveback(S.charAt(i));
        }

        System.out.println(ans);
    }


    public static char giveback(char c) {

        String ss = Character.toString(c);
        char ch = '\0';

        if ("abc".contains(ss)) ch = '2';
        if ("def".contains(ss)) ch = '3';
        if ("ghi".contains(ss)) ch = '4';
        if ("jkl".contains(ss)) ch = '5';
        if ("mno".contains(ss)) ch = '6';
        if ("pqrs".contains(ss)) ch = '7';
        if ("tuv".contains(ss)) ch = '8';
        if ("wxyz".contains(ss)) ch = '9';

        return ch;
    }
}
