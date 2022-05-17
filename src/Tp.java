import java.util.*;

public class Tp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean arr[] = new boolean[n+1];

        Arrays.fill(arr , true);

        arr[0] = false;
        arr[1] = false;

        for(int i = 2; i * i <= n; i++) {

            for (int j = i * i; j <= n; j += i) {

                arr[j] = false;
            }
        }
        int count = 0;
        int i = 2;
        int j = 3;

        while(i <= n) {

            int index = i + j;
            if(arr[index]) count++;
            j = nextTrue(arr , j++ , i);

            if(j < 0) {
                j = i;
                i = nextTrue(arr , i++ , j);
                j = nextTrue(arr , i+1 , i);
            }
        }

        System.out.println(count);
    }

    private static int nextTrue(boolean[] arr, int j , int i) {

        while (i + j < arr.length && !arr[j]) {
            j++;
        }

        if(j + i >= arr.length) return -1;

        return j;
    }


}
//    public static void swap(int arr [] , int i , int j) {
//
//        int temp = 0;
//
//        temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//
//        return;
//    }
