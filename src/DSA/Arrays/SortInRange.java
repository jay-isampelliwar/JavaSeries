package Arrays;

public class SortInRange {

    public static void main(String args []) {

        int arr[] = {1,2,3,5,5,1,4,4,2,4,1,4,3,3,2,4,2,1,3,4,5};
        int n = arr.length;
        int range = n/4;
        int hash[] = new int[range+1];
        for (int i = 0; i < n; i++) hash[arr[i]]++;

        for (int i = 1; i <= range+1; i++) {
            for (int j = 1; j < hash.length; j++) {

                if (hash[j] > 0) {

                    System.out.print(j+" ");
                    hash[j] -= 1;
                }
            }
        }
    }
}
