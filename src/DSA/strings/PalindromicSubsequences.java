package strings;

public class PalindromicSubsequences {

    public static void main(String aegs []) {

        String S = "100111011";
        int n = S.length();
        int count = 0;
        int l = n-1;
        int i;
        int j;

        while(n > 0) {

            System.out.println(n);
            i = 0;
            j = n-1;

            while (S.charAt(i) == S.charAt(j)) {

                    i++;
                    j--;

                    if (i < j) break;
            }

            l = j;

            count++;
        }

        System.out.println(count);
    }
}
