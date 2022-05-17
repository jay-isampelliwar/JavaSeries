package strings;
import java.util.ArrayList;
import java.util.HashMap;

public class SpecificPatternMatching {

    public  static  void  main(String args []) {

        String S [] = {"abb" , "vkk" , "hhl" , "abc" , "xyx" , "xzz"};
        String pat = "tyy";

        ArrayList<String> list = new ArrayList<>();

        String ptr2 = getMatch(pat);

        for (String word : S) {

            if (word.length() == pat.length() && getMatch(word).equals(ptr2)) {

                System.out.println(word);
            }
        }

    }
    public static String getMatch(String S) {

        HashMap<Character, Integer> map = new HashMap<>();
        String ptr = "";
        int j = 0;

        for (int i = 0; i < S.length(); i++) {

            if (!map.containsKey(S.charAt(i)))
                map.put(S.charAt(i) , j++);

            ptr += map.get(S.charAt(i));
        }


        return ptr;
    }
}
