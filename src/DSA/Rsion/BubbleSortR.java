package Rsion;

import java.util.Arrays;

public class BubbleSortR {

    public static void main(String[] args) {

        int [] arr = {35,37,0,-1,4,15,-15,6,4,-84,3,2,-6,90,9,0,-5,12,3,8,124};
        int n = arr.length;
        sortIt(arr , n);
        System.out.println(Arrays.toString(arr));
    }
    static int c = 1;
    static void sortIt(int[] arr , int n) {

        if (n == 0 || n == 1) return;

        for(int i = 0; i < n-1; i++) {

            if (arr[i] > arr[i + 1]) swap(arr, i, i + 1);
        }


        sortIt(arr, n-1);

        return;
    }

    public static void swap(int arr [] , int i , int j) {

        int temp = 0;

        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return;
    }
}
