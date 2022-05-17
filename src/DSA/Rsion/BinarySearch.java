package Rsion;

public class BinarySearch {

    public static void main(String[] args) {

//        int[] arr = {3,12,15,19,23,45,66,90};
        int[] arr = {1,1,1,2,2,3,4,4,5,5};
        int target = 1;
        System.out.println(search(arr , 0 , arr.length-1 , target));
    }

    public static int search(int [] arr , int low , int high , int k) {

        if(low > high) return -1;

        int mid = low + (high - low) / 2;
        if (arr[mid] < k) {

            return search(arr, mid+1, high, k);
        }
        else if (arr[mid] > k) {
            return search(arr, low, mid-1, k);
        }

        return mid;
    }
}
