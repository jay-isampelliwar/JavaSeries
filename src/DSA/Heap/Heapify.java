package Heap;

public class Heapify {

    public static void main(String args[]) {

        int arr [] = {0 , 24, 6, 10, 53, 7};
        int n = arr.length-1;

        int i = 2;

        buildHeap(arr , n);

        for (int j = 1; j <= n; j++) {

            System.out.print(arr[j]+" ");
        }
    }

    public static void buildHeap(int arr[] , int n) {

        for (int i = n /2; i >= 1 ; i--) {

            heapify(arr , n , i);
        }
    }

    public static void heapify(int arr[] , int n , int i ) {

        int large = i;
        int l = i*2;
        int r = i*2+1;

        if(l <= n && arr[l] > arr[large])
            large = l;

        if(r <= n && arr[r] > arr[large])
            large = r;

        if (large != i) {

            swap(arr , large  , i);
            heapify(arr , n , large);
        }
    }

    private static void swap(int arr[] , int i , int j) {

        int temp = 0;

        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return;
    }

}
