package Hashing;

public class SortString {

    public static void main(String args[]) {

        String s = "jayrameshisampelliwar";

        int ar[] = new int[26];

        for(int i = 0; i < s.length(); i++) {

            int c = s.charAt(i)-97;
            ar[c]++;
        }

        for(int i = 0; i < 26; i++) {

            for(int j = 1; j <= ar[i]; j++) {

                System.out.print((char)(i+97));
            }

        }
    }
}
