package cp;

import java.util.Scanner;

public class SeatingArrangament {

    public static void main (String args []) {

        Scanner sc = new Scanner(System.in);

        int seatNo = sc.nextInt();

        if (seatNo > 108) {

            System.out.println("1 to 108 Seat Number are valid");
            return;
        }

        int p = seatNo;

        while (p % 6 != 0) p++;

        int n = p / 6;
        int seatType = 0;
        int oppositeSeat = 0;

        if ((n & 1) == 0) {

            seatType = p - seatNo;
            seatType++;

            oppositeSeat = p -11;

            while (p != seatNo){

                p--;
                oppositeSeat++;
            }
        }
        else {

            seatType = p - seatNo;
            seatType++;

            oppositeSeat = p + 1;

            while (p != seatNo) {

                p--;
                oppositeSeat++;
            }
        }

        switch (seatType) {

            case 1:
                System.out.println(oppositeSeat+" WS");
                break;
            case 2:
                System.out.println(oppositeSeat+" MS");
                break;
            case 3:
                System.out.println(oppositeSeat+" AS");
                break;
            case 4:
                System.out.println(oppositeSeat+" AS");
                break;
            case 5:
                System.out.println(oppositeSeat+" MS");
                break;
            case 6:
                System.out.println(oppositeSeat+" WS");
                break;
        }
    }
}
