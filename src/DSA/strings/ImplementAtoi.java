package DSA.strings;

public class ImplementAtoi {

    public static void main(String[] args) {

        String str = "3466";
        System.out.println(atoi(str));
    }

    public static int atoi(String Str) {

        int n = Str.length();
        int ans = 0;
        boolean is_Neg = false;
        int i = 0;

        if (Str.charAt(i) == '-') {
            is_Neg = true;
            i++;
        }

        while (i < n) {

            char c = Str.charAt(i);
            if (c >= '0' && c <= '9') {

                ans = ans * 10 + (int) (c - '0');
            } else {

                return -1;
            }

            i++;
        }

        if (is_Neg) {

            return ans * (-1);
        }
        return ans;
    }
}


