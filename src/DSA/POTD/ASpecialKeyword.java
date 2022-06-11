package DSA.POTD;

//20/05/2022

import java.util.HashMap;

public class ASpecialKeyword {
    public static void main(String[] args) {

        String s1 = "abcdefghijklmnopqrstuvwxyz";
        String s2 = "z";

        System.out.println(findTime(s1 , s2));
    }

    public static int findTime(String S1 , String S2) {

        HashMap<Character , Integer> map = new HashMap<>();
        int n = S1.length();
        int m = S2.length();
        int val = 0; //val is for storing previous key value
        int time = 0;

        for(int i = 0; i < n; i++) {

            char cur = S1.charAt(i);
            map.put(cur , i);
        }

        for(int j = 0; j < m; j++) {

            char cur = S2.charAt(j);
            int get = map.get(cur);

            time += Math.abs(val - get);
            val = get;
        }

        return time;
    }
}
