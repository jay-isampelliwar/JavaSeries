package bitMagic;

import java.util.Scanner;

public class GrayToBinnay {

    public static void main(String args []) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String gray = Integer.toBinaryString(n);
        String Binary = Character.toString(gray.charAt(0));
        int p = 0;
        int o = 0;

        for (int i = 1; i < gray.length(); i++) {

             p = (int) Binary.charAt(i-1);
             o = (int) gray.charAt(i);

             p -= 48;
             o -= 48;

             int res = p ^ o;

             Binary += String.valueOf(res);

        }

        int b = Integer.parseInt(Binary ,2);
        System.out.println(b);
    }
}
