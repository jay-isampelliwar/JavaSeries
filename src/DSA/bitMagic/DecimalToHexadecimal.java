package bitMagic;

import java.util.Scanner;

public class DecimalToHexadecimal {

    public static void main (String args []) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String str = "";

        while (n > 0) {

            int rem = n % 16;
            n /= 16;
            
            if (rem > 9) {
                switch (rem) {

                    case 10:
                        str += "A";
                        break;
                    case 11:
                        str += "B";
                        break;
                    case 12:
                        str += "C";
                        break;
                    case 13:
                        str += "D";
                        break;
                    case 14:
                        str += "E";
                        break;
                    case 15:
                        str += "F";
                        break;
                }
            }

            else {

                str += String.valueOf(rem);
            }

        }


        String Hexa = "";

        for (int i = str.length()-1; i >= 0; i--) Hexa += Character.toString(str.charAt(i));

        System.out.println(Hexa);

    }
}
