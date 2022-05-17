package cp;

import java.util.Scanner;

public class WeirdAlgoritham {

    public static void main(String args []) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.print(n+" ");
        while (true) {

            System.out.print(n+" ");

            if (n == 1) break;;
            if ((n & 1) == 0) n /= 2;
            else  n = (n * 3) + 1;
        }
    }
}
