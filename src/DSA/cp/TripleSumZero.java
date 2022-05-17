package cp;

public class TripleSumZero {

    public static void main(String args[]) {

        int arr[] = {42 ,-21 ,13 ,-26 ,79 ,40 ,62 ,-60 ,29 ,-23 ,97 ,-39 ,40 ,-35 ,26 ,-54 ,87 ,5 ,77 ,21 ,28 ,10 ,32 ,-22 ,25 ,21 ,3};
        int n = arr.length;

        boolean f = false;
        int sum = 0;

        for(int i = 0; i < n; i++) {

            if(f) break;

            for(int j = i + 1; j < n-1; j++) {

                sum = arr[i] + arr[j] + arr[j+1];

                if (sum == 0) {

                    f = true;
                    break;
                }
            }
        }

        System.out.println(f);
    }
}
