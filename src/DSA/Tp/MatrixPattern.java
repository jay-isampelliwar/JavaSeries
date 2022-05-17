package Tp;
import java.util.Scanner;

public class MatrixPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int p = 1;
        String border = "+-----";
        String last = "+-----+";
        String col = "|";

        for (int i = 1; i <= m; i++) {

            for (int j = 1; j < n; j++) {
                System.out.print(border);
            }
            System.out.print(last);
            System.out.println();
            System.out.print(col);
            System.out.print("     ");

            for (int k = 1; k < n; k++) {
                System.out.print(col);
                System.out.print("     ");
            }
            System.out.println(col);
        }

        for (int i = 1; i < n; i++) {
            System.out.print(border);
        }
        System.out.print(last);
    }
}
