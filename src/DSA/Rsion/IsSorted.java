package Rsion;

public class IsSorted {

    public static void main(String[] args) {

        int arr[] = {2};
        int n = arr.length;

        System.out.println(isSorted(arr , n));
    }

    public static boolean isSorted(int arr[] , int n) {

        if(n == 1 || n == 0) return true;
        if(arr[n-2] > arr[n-1]) return false;

        return isSorted(arr, n-1);
    }
}
