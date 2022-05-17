package sortingSearching;

public class MergeSort {

    public static void main (String args []) {

        int ar[] = {110,33,54,78,9};
        int l = 0;
        int r = ar.length - 1;
        mergeSort(ar , l , r);
        for(int e : ar) System.out.print(e+" ");
    }

    static void mergeSort(int ar[] , int l, int r) {

        if (l < r) {

            int mid = (l+r)/2;
            mergeSort(ar, l, mid);
            mergeSort(ar, mid+1 , r);
            merge(ar , l , mid , r);

        }
    }

    static void merge(int ar[] , int l , int mid , int r) {

        int n1 = mid - l + 1;
        int n2 = r - mid;

        int a[] = new int[n1];
        int b[] = new  int[n2];

        for (int i = 0; i < n1; i++) {

            a[i] = ar[l+i];
        }

        for (int i = 0; i < n2; i++) {

            b[i] = ar[mid+1+i];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while (i < n1 && j < n2) {

            if (a[i] < b[j]) {

                ar[k++] = a[i++];
            }
            else {

                ar[k++] = b[j++];
            }
        }

        while (i < n1) {

            ar[k++] = a[i++];
        }

        while (j < n2) {

            ar[k++] = b[j++];
        }
    }
}
