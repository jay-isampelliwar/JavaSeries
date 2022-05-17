package Arrays;

public class CountNumberOfOnes {

    public static void main(String[] args) {

        int ar[] = {0,0,0,0,0,0,1};
        int n = ar.length;
        int l = 0;

        System.out.println(getCount(ar , l , n-1));
    }

    public static int getCount(int arr[] , int l , int h) {

        while (l <= h) {

            int mid = l + (h-l) / 2;

            if(arr[mid] < 1 ) {

                l = mid + 1;
            } else {
                h =  mid - 1;
            }
        }

        return arr.length - l;
    }
}
