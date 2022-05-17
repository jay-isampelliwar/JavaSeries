package Rsion;

public class TransferArray {

    public static void main(String args []) {

        int a[] = {1 , 2, 3, 4, 5};

        int j = a.length / 2;
        int i = 0;
        int n = a .length;

        transfer(a , n , i , j);

        for(int k : a) {

            System.out.print(k+" ");

        }
        System.out.println();
    }

    private static void transfer(int[] a, int n, int i, int j) {

        if(j == n) return;

        swap(a , i , j);
        System.out.println(a[i]+" "+a[j]);

        transfer(a, n, i + 1, j + 1);

    }

    private static void swap(int[] a, int i, int j) {

        a[i] = a[i] ^ a[j];
        a[j] = a[i] ^ a[j];


        return;
    }
}
