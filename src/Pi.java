public class Pi {

    public static void main(String[] args) {

        String S = "pipi";
        Solution s = new Solution();
        System.out.println(s.getS(S));
    }
}
class Solution {

    static String piVal = "3.14";
    static String ans = "";

    public String getS(String S) {

        int n = S.length();
        S = S + " ";

        getAns(S , n , 0);

        System.out.println(ans);

        return ans;

    }

    public static void getAns(String S ,  int n , int i) {

        if(i == n) return;

        if(S.charAt(i) == 'p' && S.charAt(i + 1) == 'i') {

            ans += piVal;
            i++;
        }
        else {

            ans += S.charAt(i);
        }

        getAns(S , n , i + 1);
    }
}