package Queue;

public class QueueUsingArray {

    int n = 6;
    int ar[] = new int[n];
    int i = 0;
    int j = 0;


    public void enQueue(int data) {

        if(i == j) {

            ar[j] = data;
            j++;
            return;
        }

        ar[j] = data;
        j++;

        if (j == n) System.out.println("Queue is full");
    }

    public int deQueue() {

        if(i > j) {

            System.out.println("Queue is out of range");
            return  0;
        }

        int r = ar[i];

        ar[i] = 0;
        i++;

        return r;
    }
}
