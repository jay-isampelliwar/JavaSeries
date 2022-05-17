package Tp;

import javafx.util.Pair;
import java.util.*;

public class cPair {

    public static void main(String[] args) {

//        int arr[] = {12,4,25,2,4,17,9,3,10,8,9,15,7,4,9};
        int arr [] = {-3, -2, -1, 0, 8, 9, 10, 1, 2, 3};
//        System.out.println(arr.length);
        int target = -6;

        System.out.println(getPair(arr , arr.length,  target));
    }

    public static ArrayList<Pair<Integer , Integer>> getPair(int arr[] , int n , int target) {

        ArrayList<Pair<Integer , Integer>> list = new ArrayList<>();

        HashSet<Integer> set = new HashSet<>();

        for(int item : arr) {
            set.add(item);
        }

        for(int item : arr) {

            if(set.contains(target-item)) {
                Pair<Integer , Integer> temp = new Pair<>(target-item , item);

                if (!list.contains(temp)) list.add(temp);
            }
        }

        return list;
    }
}
