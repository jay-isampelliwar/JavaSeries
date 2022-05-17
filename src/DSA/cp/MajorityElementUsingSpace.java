package cp;

public class MajorityElementUsingSpace {

    public static void main(String args []) {

        int ar [] = { 1, 8, 7, 4, 1, 2, 2, 2, 2, 2, 2 };
        int n = ar.length;
        int m = 0;
        int d [] = new int[n];

        for (int i = 0; i < n; i++) {

            int id = ar[i];
            d[id - 1]++;
        }
        for (int i = 0; i < n; i++) {

            if (d[i] > (n/2)) {

                m = i+1;
                break;
            }
        }


        System.out.println(m);
    }
}
