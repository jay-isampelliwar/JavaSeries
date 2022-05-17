package sortingSearching;

public class QuickSort {

    public static void main(String args[]) {

        int ar[] = {24,874,-154,156,842,-235, 0,0,0,0, -1, 1345, 26 ,6, -111111111};
        int l = 0;
        int h = ar.length-1;

        quickSort(ar , l , h);

        for( int e : ar) System.out.print(e+" ");
    }

    static void quickSort(int ar[] , int l , int h){

        if (l < h) {

            int pivot = partition(ar , l , h);

            quickSort(ar , l , pivot - 1);
            quickSort(ar , pivot + 1 , h);

        }
    }

    static int partition(int ar[] , int l , int h) {

        int pivot = ar[l];
        int i = l;
        int j = h;

        while (i < j) {

            while (ar[i] <= pivot) {

                i++;
                if (i <= h) break;

            }
            while (ar[j] > pivot) {

                j--;
                if (j < 0) break;
            }

            if (i < j) swap(ar, i, j);
        }

        swap(ar, l, j);
        return j;
    }

    public static void swap(int ar[] , int a, int b) {

        int temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;
    }
}
