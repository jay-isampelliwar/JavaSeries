package Arrays;

import java.sql.Struct;

public class MargeTwoSortedArray {

    public static void main(String[] args) {

        int a1[] = {0,6,8,9,10};
        int a2[] = {1,2,3,4,5,21};

        Solution s = new Solution();
        s.margeArray(a1 , a2 , a1.length , a2.length);

        for (int ele : a1) {

            System.out.print(ele+" ");
        }

        System.out.println();

        for (int ele : a2) {

            System.out.print(ele+" ");
        }
    }
}
class Solution {

    public void margeArray(int a1[] , int a2[] , int n , int m) {

        int gap = (n + m) / 2;
        if((gap & 1) == 1) gap++;
        boolean iInSec = false;
        boolean jInSec = false;
        boolean f = true;
        int i = 0;
        int j = gap-1;

        while (gap >= 1) {

            if (iInSec || jInSec) {

                if (j >= n) {
                    
                    j = 0;
                    jInSec = true;
                }

                if (i >= n) {

                    i = 0;
                    iInSec = true;
                }
            }
            else {


            }


            if (iInSec) {

                if (a2[i] > a2[j])
                    swap(a2 , i , j);

                i++;
                j++;
            }
            else if (jInSec) {

                if (a1[i] > a2[j]) {

                    int temp = a1[i];
                    a1[i] = a2[j];
                    a2[j] = temp;

                    i++;
                    j++;
                }
            }
            else {
                if (a1[i] > a2[j])
                    swap(a1 , i , j);

            }


        }


    }

    public static void swap(int arr[] , int i , int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return;
    }

//    public static int updateGap(int gap) {
//
////        int gap = (n + m) / 2;
////        if((gap & 1) == 1) gap++;
////        return gap;
//    }
}
