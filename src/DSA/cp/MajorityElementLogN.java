package cp;

import java.util.Arrays;

public class MajorityElementLogN {

    public static void main(String args []) {

        int ar [] =  { 1, 8, 7, 4, 1, 2, 2, 2, 2, 2, 2 };
//      int ar [] =  { 1, 1, 2, 2, 2, 2, 2, 2, 4, 7, 8 };
        int count = 1;
        int maxCount = 0;
        int majoEle = 0;
        Arrays.sort(ar);

        for (int i = 1; i < ar.length; i++) {

            if (ar[i-1] == ar[i]) {

                count++;

                if (count > maxCount) maxCount = count;

                if (maxCount > (ar.length / 2))  {

                    majoEle = ar[i];
                    break;
                }
            }
            else count = 1;


        }

        System.out.println(majoEle);
    }
}
