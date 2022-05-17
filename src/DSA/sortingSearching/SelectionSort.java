package sortingSearching;
import java.util.Arrays;

public class SelectionSort {

     public void sortArray(int array[] , int n) {

         for(int i = 0; i < n-1; i++) {

             int min = i;
             for(int j = i + 1; j < n-1-i; j++) {

                 if(array[min] > array[j]) {
                     min = j;
                 }
             }

             int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
         }
     }

    public void print(int array []) {

        System.out.println("Selection Sort : "+ Arrays.toString(array));
    }
}