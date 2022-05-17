package Deque;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;

public class DistinctElementInK {

    public static void main(String[] args) {

        int arr[] = {1,2,1,3,4,2,3};
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        ArrayDeque<Integer> q = new ArrayDeque<>();
        int k = 4;
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0; i < k; i++) {

            int cur = arr[i];
            q.addFirst(cur);

            if(map.containsKey(cur)) {
                int get = map.get(cur);
                map.put(cur, get+1);
            }
            else {

                map.put(cur, 1);
            }
        }

        list.add(map.size());

        for(int i = k; i<n; i++) {

            int cur = arr[i];
            int removed = q.removeLast();

            if(map.containsKey(removed) && map.get(removed) > 1){
                int get = map.get(removed);
                map.put(removed , get-1);
            }
            else {

                q.addFirst(cur);
                
                if(map.containsKey(cur)) {
                    int get = map.get(cur);
                    map.put(cur, get+1);
                }
                else {
                    map.put(cur, 1);
                }
            }

            list.add(map.size());
        }

        System.out.println(list);
    }
}
