package Arrays;

import java.util.Arrays;

public class MaxNumberPossible {

    public static void main (String args []) {

        int ar [ ] = {3, 30, 34, 5, 9 };
        int arr [ ] = new int[ar.length];

        int max = 0;
        int p = 0;
        int m = 0;

        for (int i = 0; i < ar.length; i++) {

            for(int j = i + 1; j < ar.length; j++) {

                if(arr[p] == ar[j]) continue;

                if(ar[j] > 9) {
                        m = ar[j] / 10;
                    if (m > max) max = m;
                }
                else {

                    if (m > max) max = m;
                }
            }

            arr[p] = max;
            p++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
