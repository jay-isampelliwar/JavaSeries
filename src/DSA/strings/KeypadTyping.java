package strings;

public class KeypadTyping {

    public static void main(String aegs []) {

        String S = "4445556668883399966688";
        String ans = "";
        int n = S.length();
        int i = 0;
        int j = 1;
        int count = 1;

        while (i < n) {

            char ch = S.charAt(i);

            if ( j != n) {
                while (ch == S.charAt(j)) {

                    j++;
                    count++;
                    if (j == n) break;
                }
            }

            switch (ch) {

                case '2':
                    char key2 [] = {'A', 'B', 'C'};
                    ans += key2[count-1];
                    break;

                case '3':
                    char key3 [] = {'D', 'E', 'F'};
                    ans += key3[count-1];
                    break;

                case '4':
                    char key4 [] = {'G', 'H', 'I'};
                    ans += key4[count-1];
                    break;

                case '5':
                    char key5 [] = {'J', 'K', 'L'};
                    ans += key5[count-1];
                    break;

                case '6':
                    char key6 [] = {'M', 'N', 'O'};
                    ans += key6[count-1];
                    break;

                case '7':
                    char key7 [] = {'P', 'Q', 'R', 'S'};
                    ans += key7[count-1];
                    break;

                case '8':
                    char key8 [] = {'T', 'U', 'V'};
                    ans += key8[count-1];
                    break;

                case '9':
                    char key9 [] = {'W', 'X', 'Y', 'Z'};
                    ans += key9[count-1];
                    break;

                case ' ':
                    break;

            }

            count = 1;
            i = j;
            j++;
        }

        System.out.println(ans);
    }
}
