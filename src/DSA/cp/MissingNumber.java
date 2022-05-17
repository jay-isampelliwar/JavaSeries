package cp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MissingNumber {

    public static void main (String args []) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ar [] = new int[n];

        for(int i = 0; i < n-1; i++) {

            int temp = sc.nextInt();
            ar[temp-1] = 1;
        }

        int ans = 0;

        for (int i = 0; i < n; i++)
            if (ar[i] == 0) {
                ans = i+1;
                break;
            }

        System.out.println(ans);
    }
}
