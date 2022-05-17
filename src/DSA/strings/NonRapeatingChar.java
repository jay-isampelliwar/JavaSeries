package strings;

class NonRepeatingChar {

    public static void main(String args []) {

        String s = "kapoor ka bacha bach gayy g yyr";

        int ans = 0;

        for(int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ')
                ans ^= s.charAt(i);

        }

        System.out.println((char)ans);
    }
}
