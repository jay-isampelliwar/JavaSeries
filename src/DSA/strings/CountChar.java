package strings;

public class CountChar {

    public static void main (String[] args) {

        String s = "AAAAABCCCCCDDDD";
        String ans = "";
        s = s + " ";
        int j = 0;
        int i = j;
        int count = 0;
        int n = s.length();


        while (i <= n) {

            if(s.charAt(i) != s.charAt(j)) {

                ans = ans + s.substring(j , i) + Integer.toString(count);
                j = i;
                count = 0;
            }
            else {

                count++;
                i++;
            }
        }


        System.out.println(s);
    }
}
