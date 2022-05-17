package sortingSearching;

import java.util.Arrays;

public class BubleSort {

    public  void  sortArray(int array[], int n){

        int temp = 0;

        for(int i = 0; i < n - 1; i++) {

            boolean sort = true;

            for(int j = 0; j < n - 1; j++) {

                if(array[j+1] < array[j]) {
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    sort = false;
                }
            }

            if (sort) break;
        }


    }

    public void print(int array []) {

        System.out.println("Buble Sort :     "+ Arrays.toString(array));
    }
}
