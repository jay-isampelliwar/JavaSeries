package Arrays;

import java.util.Scanner;

public class RotatedArray {

    public static void main(String aegs []) {

        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int n = a.length;

        //   10 88 36 81 93 47 156 98 762 84

        for (int i = 0; i < n;  i++) {

            a[i] = sc.nextInt();
        }

        int D = 8;
        int i = n-D;
        int temp = a[i];
        a[i] = a[0];

        while (i != 0) {

            if(i-D >= 0) {

                temp = swap(a , temp , i-D);
                i = i - D;

            }
            else {

                int ind = i - D;
                i = n + ind;
                temp = swap(a , temp , i );

            }
        }

        for(int j : a) System.out.print(j+" ");

    }

    public static int swap(int a[] , int val , int i) {

        int temp = a[i];
        a[i] = val;

        return temp;
    }
}
