package bitMagic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DecimalToBinary {

    public static void main(String args [])  throws  Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a Decimal Number : ");
        int n = Integer.parseInt(br.readLine());

        System.out.println(convertToBinary(n));
    }

    private static String convertToBinary(int n) {

        String S = "";
        while (n > 0) {

            if ((n & 1) == 0) S += "0";
            else S += "1";

            n /= 2;

        }

        String Str = "";
         for (int i = S.length()-1; i >= 0; i--)
             Str += S.charAt(i);

         return Str;
    }
}
