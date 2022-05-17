package Her;

import java.util.Scanner;

public class PerfectSquare {

    public static void main (String args []) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");

        int n = sc.nextInt();
        int i = 1;

        do {

            if (i*i == n) {

                System.out.println("Perfect Square");
                return;
            }
            i++;
        }
        while (i <= n);

        System.out.println("Not Perfect Square");
    }
}
