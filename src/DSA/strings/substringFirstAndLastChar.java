package strings;

public class substringFirstAndLastChar {

    public static void  main(String args[]) {

        String s = "geeksforgeeks";
        int n  = s.length();
        int count = n;
        for(int i = 0; i < n; i++) {

            for(int j = n-1; j > i; j--) {

                if (s.charAt(i) == s.charAt(j)) {

                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
