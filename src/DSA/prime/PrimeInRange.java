package prime;

import java.util.Arrays;

public class PrimeInRange {

    public static void  main(String args[]) {

        boolean ar[] = findPrime(22 , 58);

        for (int i = 0; i < ar.length; i++) {

            if (ar[i]) System.out.print(i+" ");
        }
    }

    public static boolean[] findPrime(int l , int r) {

        boolean ar[] = new boolean[r+1];

        Arrays.fill(ar , true);

        for(int i = 0; i < l; i++) ar[i] = false;

        for(int i = 2; i * i <= r; i++) {

            for(int j = 2 * i; j <=r; j += i) {

                ar[j] = false;
            }
        }

        return ar;
    }
}
