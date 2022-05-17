package Heap;

public class MyHeap {

    static int [] heapArray = new int[101];
    static int index = 1;

    public int getIndex() {

        return index;
    }

    public void insert(int value) {

        if(index == 1) {

            heapArray[index] = value;
            index++;
            return;
        }

        if (index == heapArray.length) {

            System.out.println("Heap is full");
            return;
        }

        heapArray[index] = value;
        int i = index;
        index++;

        while (i > 1) {

            int parent = i / 2;

            if(heapArray[parent] < heapArray[i]) {

                swap(parent , i);

                i = parent;
            }
            else {

                return;
            }
        }

    }

    public void delete() {

        if(index == 1) return;

        index--;
        heapArray[1] = heapArray[index];
        heapArray[index] = 0;

        int i = 1;

        while (i < index) {

            int left = 0;
            int right = 0;

            if(i*2 <= index) {

                left =  heapArray[i*2];
            }
            else {

                left = 0;
            }

            if(i*2+1 <= index) {

                right =  heapArray[i*2+1];
            }
            else {

                right = 0;
            }

            if (right == 0 && left == 0) return;

            int large = left < right ? i * 2 + 1 : i * 2;

            if(heapArray[i] < heapArray[large]) {

                swap(i , large);

                i = large;
            }
            else {

                return;
            }
        }

    }

    public static void heapify( int n , int i ) {

        int large = i;
        int l = i*2;
        int r = i*2+1;

        if(l <= n && heapArray[l] > heapArray[large])
            large = l;

        if(r <= n && heapArray[r] > heapArray[large])
            large = r;

        if (large != i) {

            swap(large  , i);
            heapify( n , large);
        }
    }

    public void sortHeap() {

        if (index == 1) return;

        index--;

        int ar[] = new int[index];

        for(int i = index ; i >= 1; i--) {

            ar[i-1] = heapArray[1];
            heapArray[1] = heapArray[i];
            heapArray[i] = 0;
            heapify(i-1 , 1);

        }

        for (int p : ar)
            System.out.print(p+" ");
    }

    private static void swap(int i , int j ) {

        int temp = 0;

        temp = heapArray[i];
        heapArray[i] = heapArray[j];
        heapArray[j] = temp;

        return;
    }

    public void print() {

        if (index == 1) {

            System.out.println("Heap is Empty");
            return;
        }

        for (int i = 1; i < index ; i++) {

            System.out.print(heapArray[i]+" ");
        }
    }

}
