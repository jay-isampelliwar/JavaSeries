package Tp;

import java.util.Scanner;

public class SeriesX {

    public static void main(String args []) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int n = 1;

        while(X > 0) {

            int temp = (3*n)+2;

            if (temp % 4 != 0) {
                System.out.print(temp+" ");
                X--;
            }

            n++;

        }
    }
}
