package Rsion;

import java.util.Arrays;

public class SelectionSortR {

    public static void main(String[] args) {

        int [] arr = {5,7,2,1,8,2};
        int n = arr.length;

        sortIt(arr , n-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortIt(int[] arr , int n) {

        if(n == 0 || n == 1) return;

        int min = n;
        for (int i = 0; i < n-1; i++) {

            if(arr[i] > arr[i+1]) min = i;
        }
        swap(arr , n , min);
        sortIt(arr , n-1);



    }

    public static void swap(int arr [] , int i , int j) {

        int temp = 0;

        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return;
    }
}
