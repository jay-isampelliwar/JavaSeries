package cp;
public class MergeTwoSortedArray {

    public static void main (String args []) {

        int a[] = { 1 , 4 , 7 , 8 , 10};
        int b[] = {2 , 3 , 9};

        int gap = (a.length + b.length) / 2;
        int i = 0;
        int j = gap + i;

        while (gap > 1) {

            if (j < a.length) {

                if (a[i] > a[j]) {

                    a[i] = a[i] ^ a[j];
                    a[j] = a[i] ^ a[j];
                    a[i] = a[i] ^ a[j];
                    i++;
                    j++;
                }
            }
            else {
                j = j - a.length;

                if (j < b.length) {

                    if (i < a.length) {

                        if (a[i] > b[j]) {
                            a[i] = a[i] ^ b[j];
                            b[j] = a[i] ^ b[j];
                            a[i] = a[i] ^ b[j];
                            i++;
                            j++;
                        }
                    }
                    else {

                        i = i - a.length;

                            if (b[i] > b[j]) {

                                b[i] = b[i] ^ b[j];
                                b[j] = b[i] ^ b[j];
                                b[i] = b[i] ^ b[j];
                                i++;
                                j++;
                            }
                    }
                }
                else {

                    gap = gap / 2;
                    i = 0;
                    j = gap + i;
                }
            }

        }

        System.out.println(String.valueOf(a)+" : "+String.valueOf(b));
     }
}
