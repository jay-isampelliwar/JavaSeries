package Arrays;

import java.util.Arrays;

public class NextPermutation {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
//        int arr[] = {5,4,3,2,1};
        int n = arr.length;
        int i = n-2;

//        for(int k = 1; k <= n*n; k++) {

            getPermutation(arr , i , n);
            System.out.println(Arrays.toString(arr));
//        }
    }

    public static void getPermutation(int arr[] , int i , int n) {

        while( i >= 0 && arr[i] >= arr[i+1]) i--;

        if ( i >= 0) {

            int j = n-1;
            while (j >= 0 && arr[i] >= arr[j]) j--;
            swap(arr , i , j);
        }

        reverse(arr , i + 1 , n-1);
    }

    public static void reverse(int arr[] , int i , int j) {

        while (i < j) swap(arr , i++ , j--);
    }

    public static void swap(int arr [] , int i , int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }
}
