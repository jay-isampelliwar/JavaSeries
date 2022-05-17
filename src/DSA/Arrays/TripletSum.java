package Arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TripletSum {

    public static void main (String args[]) {

        int ar [] = {-1, 2, -3, -1, -5, 4, 2, -2, 1 , -1, 5};

        Arrays.sort(ar);
        List<List<Integer>> list = new LinkedList<>();

        for (int i = 0; i < ar.length-2; i++) {

            if (i == 0 || (i > 0 && ar[i] > ar[i-1])) {

                int l = i+1 , h = ar.length-1, sum = 0 - ar[i];

                while (l < h) {

                    if (ar[l] + ar[h] == sum) {

                        list.add(Arrays.asList(ar[i] , ar[l] , ar[h]));

                        while (l < h && ar[l] == ar[l+1]) l++;
                        while (l < h && ar[h] == ar[h-1]) h--;

                        l++;
                        h--;

                    }
                    else if(ar[l] + ar[h] < sum) l++;

                    else h--;
                }
            }
        }

        System.out.println(list);
    }
}
