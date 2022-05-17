package c;

import java.util.Scanner;

public class Minesweeper {

    public static void main(String args []) {

        Scanner sc = new Scanner(System.in);

        int n;
        int m;
        int ymm = 0;

        char [][] a = new char[101][101];

        while (true) {

            n = sc.nextInt();
            m = sc.nextInt();

            if(n == 0 || m == 0) break;

            for (int i = 0; i < n; i++) {

                String s = sc.next();
                a[0][i] = s.charAt(0);
            }

            if(ymm == 0) System.out.println();


            for(int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {

                    if( a[i][j] == '*' )
                        continue;

                    int temp = 0;

                    if( i + 1 < n && a[i + 1][j] == '*' )
                        ++temp;
                    if( i + 1 < n && j + 1 < m && a[i + 1][j + 1] == '*' )
                        ++temp;
                    if( j + 1 < m && a[i][j + 1] == '*' )
                        ++temp;
                    if( i - 1 >= 0 && j + 1 < m && a[i - 1][j + 1] == '*' )
                        ++temp;
                    if( i - 1 >= 0 && a[i - 1][j] == '*' )
                        ++temp;
                    if( i - 1 >= 0 && j - 1 >= 0 && a[i - 1][j - 1] == '*' )
                        ++temp;
                    if( j - 1 >= 0 && a[i][j - 1] == '*' )
                        ++temp;
                    if( i + 1 < n && j - 1 >= 0 && a[i + 1][j - 1] == '*' )
                        ++temp;

                    a[i][j] = (char)(temp +'0');
                }
            }

            System.out.println("Field "+ ++ymm);

            for(int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    System.out.print(a[i][j]);
                }
                System.out.println();
            }

        }
    }
}

