package DSA.prime;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeFactor {

    public static void main(String[] args) {

        int n = 2;
        System.out.println(AllPrimeFactor(n));
    }

    private static ArrayList<Integer> AllPrimeFactor(int N) {

        boolean[] arr = new boolean[N + 1];
        steve(arr, N + 1);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= N; i++) {

            if (arr[i] && N % i == 0) {

                list.add(i);
            }
        }
        return list;
    }

    public static void steve(boolean[] arr, int len) {

        Arrays.fill(arr, true);
        arr[0] = false;
        arr[1] = false;

        for (int i = 2; i * i < len; i++) {

            for (int j = i * i; j < len; j += i) {

                arr[j] = false;
            }
        }

        return;
    }
}
