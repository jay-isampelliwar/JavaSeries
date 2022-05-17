package cp;

import java.util.*;

public class NumberOfDistinctElements {

    public static void main(String args[]) {

        int a [] = {1,3,1,3,5,7,8,9,0,5,2,6,9,0,4,23,51,5,7,5,2,51};
        int n = a.length;

        System.out.println(find(a , n));
    }

    public static int find(int a[] , int n) {

        HashSet<Integer> set = new HashSet<>();

        for( int i : a) {

            if(!set.contains(i)) set.add(i);
            else set.remove(i);
        }

        System.out.println(set);

        return set.size();
    }
}
