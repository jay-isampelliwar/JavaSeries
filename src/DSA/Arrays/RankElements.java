package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class RankElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 5;

        ArrayList<Integer> l = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int get = sc.nextInt();


            l.add(get);
        }

        l = replaceWithRank(l , n);

        System.out.println(l);
    }

    public static ArrayList<Integer> replaceWithRank(ArrayList<Integer> arr, int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> p = new PriorityQueue<>();
        HashMap<Integer , Integer> map = new HashMap<>();
        int count = 1;

        for(int ele : arr) {

            p.add(ele);
        }

        while(!p.isEmpty()) {

            int ele = p.poll();

            if(!map.containsKey(ele)) {

                map.put(ele , count++);
            }
        }

        for(int i = 0; i < n; i++) {

            int get = arr.get(i);
            list.add(map.get(get));
        }

        return list;

    }
}
