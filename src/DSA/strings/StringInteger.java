package strings;

public class StringInteger {

    public static void  main(String args []) {

        String S = "420-9 kn  og3583 tryr74t235g352 dfh53 235 g4  252 sy636 v da54 3w 7rr24  34w3";
        int i = 0;
        String str = "";
        int n = S.length();

        while (i < n) {

            int j = 0;
            if (S.charAt(i) >= '0' && S.charAt(i) <= '9') {
                j = i;

                while (S.charAt(j) >= '0' && S.charAt(j) <= '9') {
                    j++;
                    if (j >= n-1) break;
                }

                str = str + S.substring(i , j) + " ";

                i = j;
            }
            i++;
        }

        System.out.println(str.trim());
    }
}
