package DSA.strings;

public class ValidateIPAddress {

    public static void main(String[] args) {

        String _IP_address = "222.111.111.111";
//        String _IP_address = "2a.1011.011.1";

        System.out.println(isValidIP(_IP_address));
    }

    public static boolean isValidIP(String Str) {

        int n = Str.length();
        if (n < 7 || n > 15) return false;

        Str = Str + '.';
        n = n + 1;
        int sections = 0;
        int i = 0;
        int j = 0;

        while (j < n) {

            sections++;

            if (Str.charAt(j) >= 'a') return false;
            if (Str.charAt(j) == '0' && Str.charAt(j + 1) != '.') return false;
            while (j < n && Str.charAt(j) != '.') j++;
            if (Str.charAt(i) != '.' && j - i <= 3 && 255 < Integer.parseInt(Str.substring(i, j))) return false;
            if (j + 1 < n && Str.charAt(j + 1) == '.') return false;

            j++;
            i = j;
        }

        if (sections != 4) return false;
        return true;
    }
}

