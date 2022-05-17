package Heap;

public class CountLeafNode {

    public static void main(String args []) {

        int a[] = { 0, 36, 25, 15, 12, 9, 7, 6, 2, 1};

        int i = 4;
        int l = 2 * 4;
        int r = (2 * 4) + 1;
        int n = a.length;

        if(i >= n) System.out.println("No Node");
        else System.out.println("Root Node "+a[i]);

        if (l >= n) System.out.println("No Node");
        else System.out.println("Left Node "+a[l]);

        if (r >= n) System.out.println("No Node");
        else System.out.println("Right Node "+a[r]);

        System.out.println("Total Life Node "+(((a.length - 1)/2)+1));

        int start = ((a.length-1) / 2) + 1;

        System.out.print("List of leaf nodes : ");

        for(int p = start  ; p < n; p++) {

            System.out.print(a[p]+" ");

        }

        System.out.println();

    }
}
