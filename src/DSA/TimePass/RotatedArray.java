package TimePass;

import java.util.Arrays;

public class RotatedArray {

    public static void main(String[] args) {

        int ar[] = {1, 2, 3, 4, 5};
        int n = ar.length;
        int k = 4  ;

        int i = 0;
        int j = k - 1;
        int temp1 = 0;
        int temp2 = ar[k-1];

        while(i < n) {

            temp1 = ar[i];
            ar[i] = temp2;

            j++;

            if(j == n) {

                j = k - 1;
                continue;
            }

            temp2 = ar[j];
            ar[j] = temp1;

            i++;
        }

        System.out.println(Arrays.toString(ar));
    }
}
