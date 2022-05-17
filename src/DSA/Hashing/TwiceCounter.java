package Hashing;

import java.util.HashMap;
import java.util.Map;

public class TwiceCounter {

    public static void main(String args []) {

        String s[] = { "Tom", "Jerry", "Bob", "Tom", "Jerry",
                "Courage", "Tom", "Courage" };

        int n = s.length;
        int ans = 0;
        HashMap<String , Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {

            if(map.containsKey(s[i])) {

                int get = map.get(s[i]);
                map.put(s[i] , get+1);
            }
            else {

                map.put(s[i] , 1);
            }
        }

        for(Map.Entry<String , Integer> val : map.entrySet()) {

            if (val.getValue() == 2) {

                ans++;
            }
        }

        System.out.println(ans);
    }
}
