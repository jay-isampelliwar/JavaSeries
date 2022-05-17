package Tp;

import java.util.Arrays;

public class RightShifAllZero {

    public static void main(String args[]) {

        int ae[] = { 1 , 0 ,0,1,20,0,0 ,0 , 3 , 0 , 5};

        int temp = 0;
        int n = ae.length;
        int j = 0;

        while (ae[j] != 0) {

            j++;

            if (j >= n) return;
        }

        for(int i = j + 1; i < n; i++) {

            if(ae[i] != 0) {

                temp = ae[i];
                ae[i] = ae[j];
                ae[j] = temp;

                i++;
                j++;
            }
        }

        System.out.println(Arrays.toString(ae));
    }
}
