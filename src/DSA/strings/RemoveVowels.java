package strings;

public class RemoveVowels {

    static boolean vowels(char c) {

        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }

    public static void main(String args []) {

        String S = "welcomE tAO gEeksforgEeks";
        int n = S.length();
        int i = 0;

        while(i < S.length()) {

            if(vowels(S.charAt(i))) {

                String ss = Character.toString(S.charAt(i));

                S = S.replaceAll(ss , "");

                n = S.length();
            }
            else i++;
        }

        System.out.println(S);
    }
}
