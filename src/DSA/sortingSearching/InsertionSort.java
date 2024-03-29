package sortingSearching;

import java.util.Arrays;

public class InsertionSort {

    public void sortArray(int array [] , int n) {

        for(int i = 1; i < n; i++) {
            int current = array[i];
            int j = i -1;

            while (j >= 0 && array[j] > current) {

                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = current;
        }
    }

    public void print(int array []) {

        System.out.println("Insertion Sort : "+ Arrays.toString(array));
    }
}
