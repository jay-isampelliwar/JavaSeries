package Arrays;
import java.util.Arrays;

public class AlternativeArray {

    public static void main(String args []) {

        int arr[ ] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int mid =  n/2;

        int brr [] = new int[n];
        int k = 0;

        for (int i = n-1; i >= mid; i--) brr[k++] = arr[i];
        k = 0;
        for (int i = mid; i < n; i++) brr[i] = arr[k++];

        System.out.println(Arrays.toString(brr));

        k = 0;
        int i = 0;
        int j = n % 2 == 0 ? mid : mid + 1;
        while ( k < n) {

            if (i <= mid) {

                arr[k++] = brr[i++];
            }
            if (j < n) {

                arr[k++] = brr[j++];
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
