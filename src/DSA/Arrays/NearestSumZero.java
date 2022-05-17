package Arrays;
import java.util.*;

public class NearestSumZero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int i = 0;
        int j = n - 1;
        int ans = Integer.MAX_VALUE;

        while(i < j) {

            int sum = arr[i] + arr[j];

            if(Math.abs(sum) < Math.abs(ans)) ans = sum;

            if(Math.abs(arr[i]) >= arr[j]) {

                i++;
                continue;
            }

            if(Math.abs(arr[i]) < arr[j]) {

                j--;
                continue;
            }
        }

        System.out.println("\n"+ans);
    }
}
