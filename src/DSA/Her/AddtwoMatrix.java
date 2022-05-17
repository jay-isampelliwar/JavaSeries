package Her;

import java.util.Scanner;

public class AddtwoMatrix {

    public static void main (String args []) {

        Scanner sc = new Scanner(System.in);

        int n = 3;

        int matrix1 [][] = new int[n][n];
        int matrix2 [][] = new int[n][n];
        int matrixResult [][] = new int[n][n];

        System.out.println("Enter 1st matrix elements");

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {

                matrix1 [i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter 2nd matrix elements");

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {

                matrix2 [i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {

                matrixResult [i][j] = matrix1[i][j]  * matrix2[i][j];
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrixResult[i][j]+" ");
            }
            System.out.println();
        }
    }
}
