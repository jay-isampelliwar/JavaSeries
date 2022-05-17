package sortingSearching;

public class MinimumNumberInSortedRotatedArray {
    public static void main(String[] args) {

        int arr[] = {5,4,3,2,1};
        System.out.println(findMin(arr , 0 , arr.length - 1));
    }
    public static int findMin(int[] arr , int low , int high) {

        while (low <= high) {

            int mid = low + (high - low )/2;

            if(mid < arr.length && arr[mid] > arr[mid+1]) {
                return arr[mid+1];
            }
            if (mid > 0 && arr[mid-1] > arr[mid]) {
                return arr[mid];
            }

            if(arr[low] <= arr[mid] && arr[mid] > arr[high]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return arr[low];
    }
}
