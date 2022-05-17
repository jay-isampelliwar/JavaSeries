package Arrays;

import java.util.Arrays;

public class ThreeWayPartitioning {

    public static void main(String[] args) {

        int [] arr = {4,3,2,5,7,9,8,9,1,3,2};
        int n = arr.length;
        int a = 4;
        int b = 7;

        int l = 0;
        int r = n-1;

        for (int i = 0; i <= r; i++) {

            if (arr[i] < a){

                swap(arr , i , l++);
            }
            else if (arr[i] > b) {

                swap(arr , i , r);
                r--;
                i--;
            }
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int arr [] , int i , int j) {

        int temp = 0;

        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return;
    }
}
