public class ReverseWbyW {

    public static void main(String[] args) {

        String s = "fuck you all my haters";
        String ans = "";
        s = " " + s;
        int i = s.length() - 1;
        int j = i;

        while (i >= 0) {

            if(s.charAt(i) == ' ') {

                ans = ans + s.substring(i+1 , j+1) + " ";
                i--;
                j = i;
                continue;
            }
            i--;
        }
        System.out.println(ans.substring(0,ans.length()-1));
    }
}
