package cp;

import java.util.Arrays;

public class SortingDescending {

    public static void main(String args []) {

        int a[] = { 14 , 23 , 7 , 8 , 1 , 3};

        for (int i = 0; i < a.length; i++)
            a[i] = a[i]-(2*a[i]);

        Arrays.sort(a);


        for(int i = 0; i < a.length; i++)
            a[i] = Math.abs(a[i]);

        for (int y : a) System.out.print(y+" ");
    }
}
