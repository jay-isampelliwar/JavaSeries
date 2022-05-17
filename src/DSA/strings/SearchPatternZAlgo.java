package strings;

import java.util.ArrayList;

public class SearchPatternZAlgo {

    public static void main(String[] args) {

        String S = "bbbbbbbbbb";
        String pat = "bbb";

        ArrayList<Integer> list = new ArrayList<>();

        list = getPoints(S , pat);

        System.out.println(list);
    }

    public static ArrayList<Integer> getPoints(String S , String pat) {


        ArrayList<Integer> list = new ArrayList<>();
        int n1 = S.length();
        int n2 = pat.length();
        int i = 0;
        int j;

        while (i < n1) {

            j = 0;
            int temp = i;
            while (S.charAt(i) == pat.charAt(j)) {

                j++;
                i++;

                if(j == n2) {

                    list.add(i - (n2-1));
                    break;
                }
                if (i == n1) break;

            }

            i = temp+1;
        }

        if (list.isEmpty()) {

            list.add(-1);
        }

        return  list;
    }
}
