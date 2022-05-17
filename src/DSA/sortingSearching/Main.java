package sortingSearching;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void  main(String args []) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter array elements : ");
        for(int r = 0; r < n; r++) a[r] = sc.nextInt();
        System.out.println("Before sort array "+Arrays.toString(a));

        BubleSort bubleSort = new BubleSort();
        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort();


        bubleSort.sortArray(a , n);
        selectionSort.sortArray(a , n);
        insertionSort.sortArray(a , n);
        bubleSort.print(a);
        selectionSort.print(a);
        insertionSort.print(a);

//        System.out.println("After array sorted "+Arrays.toString(a));
    }
}
