package Heap;

public class CheckHeapNode {

    public static void main(String args[]) {

        int a[] = {0 , 30 , 40 , 19 , 20 , 18 , 12};
        int n = a.length;

        int l = 2 * 1;
        int r = (2 * 1) + 1;

        int large = a[l] > a[r] ? l : r;

        if(a[large] > a[1])swap(a , large , 1);

        for (int i : a) System.out.print(i+" ");
    }

    public static void swap(int a[] , int l , int r) {

        a[l] = a[l] ^ a[r];
        a[r] = a[l] ^ a[r];
        a[l] = a[l] ^ a[r];
    }
}
