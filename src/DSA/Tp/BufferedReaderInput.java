package Tp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BufferedReaderInput {

    public static void main(String aegs [])  throws  Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        String s [] = line.trim().split("\\s+");

        int ar [] = new int[5];

        for (int i = 0; i < 5; i++) {

            ar[i] = Integer.parseInt(s[i]);
        }


        System.out.println(Arrays.toString(ar));
    }
}
