package Hashing;

import java.util.HashMap;
import java.util.Map;

public class RangeLimit {

    public static void main(String args []) {

        int arr[] = {3,3,3,3,4};
        int N = arr.length;
        int P = 3;

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 1; i <= P; i++) {

            map.put(i , 0);
        }

        int v = -1;
        for(int i = N-P; i <= N; i++) {

            map.put(v++ , 0);
        }

        for(int i = 0; i < N; i++ ) {

            if(map.containsKey(arr[i])) {

                int get = map.get(arr[i]);

                map.put(arr[i] , get + 1);
            }

        }


        for(Map.Entry<Integer , Integer> val : map.entrySet()) {

            System.out.print(val.getValue()+" ");
        }
    }
}
