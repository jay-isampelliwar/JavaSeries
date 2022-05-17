package Arrays;

import java.util.Scanner;

public class MoveAllZeroToRight {

    public static void main(String args []) throws Exception{

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int arr[] = new int[N];

        for(int i = 0; i < N; i++) arr[i] = sc.nextInt();

        boolean endAr = false;
        int i = 0;
        int j = 1;

        while (j < N) {

            while (arr[i] != 0) {

                i++;
                j = i + 1;

                if (j >= N) {

                    endAr = true;
                    break;
                }
            }

            if (endAr) break;

            if(arr[j] != 0) {

                swap(arr, i , j);
            }
            else {

                j++;
                continue;
            }

            i++;
            j++;


        }
        display(arr , N);
    }

    public static void swap(int a[] , int i , int j) {

        a[i] = a[i] ^ a[j];
        a[j] = a[i] ^ a[j];
        a[i] = a[i] ^ a[j];
        return;
    }

    public static void display(int a[] , int len) {

        for(int i : a) {

            System.out.print(i+" ");
        }
    }
}
