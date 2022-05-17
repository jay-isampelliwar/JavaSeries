package bitMagic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class BinaryToDecimal {

    public static void main(String args []) throws  Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Binary Number : ");
        String S = br.readLine();

        System.out.println(convertToDecimal(S));
    }

    public static long convertToDecimal(String S) {

        long decimal = 0;
        int m = 1;
        int i = S.length()-1;
        while ( i >= 0) {

            if (S.charAt(i) == '1') decimal += m;

            m *= 2;
            i--;

        }

        return decimal;
    }
}
