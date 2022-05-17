package Arrays;

public class FindFirstAndLastOccarance {

    public static void main(String[] args) {

        int ar[] = {3,4,4,4,4,4,5,6,8,9,9,9};
        int n = ar.length;
        int l = 0;
        int target = 99;

        System.out.println(searsh(ar , l , n-1 , target , true)+" "+searsh(ar , l , n-1, target , false));
    }

    public static int searsh(int arr[] , int l , int h , int target , boolean flag) {

        int ans = -1;
        while (l <= h) {

            int mid = l + (h-l) / 2;

            if(arr[mid] < target) {

                l = mid + 1;
            } else if(arr[mid] > target) {
                h =  mid - 1;
            }
            else {

                ans = mid;

                if (flag) {

                    h = mid - 1;
                }
                else
                {
                    l = mid + 1;
                }
            }
        }

        return ans;
    }
}
