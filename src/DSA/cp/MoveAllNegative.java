package cp;

public class MoveAllNegative {

    public static void main(String args []) {

        int ar[] =  {1, -1, -3, -2, -7, -5, -11, 6 };

        int n = ar.length;

        move(ar , n);
    }

    public static void move(int ar [] , int n) {

        int f = 0;
        int l = n-1;
        int j = l;

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {

            if(j >= 0) {
                if (ar[j] < 0) {

                    a[l] = ar[j];
                    l--;
                }
            }
            j--;
            if (ar[i] > 0)
            {
                a[f] = ar[i];
                f++;
            }
        }


        for (int b: a) System.out.print(b+" ");
    }
}
