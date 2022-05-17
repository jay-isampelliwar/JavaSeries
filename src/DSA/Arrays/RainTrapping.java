package Arrays;

public class RainTrapping {

    public static void main(String[] args) {

        int a[] = {4,0,1,2,3,5,0,0,1,3};
        int n = a.length;
        System.out.println(getTotalWater(a , n));

    }

    static int getTotalWater(int arr[] , int n) {

        int ans = 0;

        int left [] = new int[n];
        int right [] = new int[n];
        int rightMax = arr[n-1];
        int leftMax = arr[0];

        for(int i = 0; i < n; i++) {

            leftMax = Math.max(leftMax , arr[i]);
            left[i] = leftMax;

        }


        for(int i = n-1; i >= 0; i--) {

            rightMax = Math.max(rightMax , arr[i]);
            right[i] = rightMax;

        }

        for(int i = 0; i < n; i++) {

            ans += (Math.min(left[i] , right[i]) - arr[i]);
        }

        return ans;
    }
}
