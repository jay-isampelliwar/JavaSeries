package cp;

import java.util.ArrayList;
import java.util.LinkedList;

public class SpiralMatrix {

    public static void main(String[] args) {

        int ar[][] = {  {1,3,4},
                        {6,8,9},
                        {11,12,13},
                        {16,17,18}
                    };

        int r = ar.length;
        int c = ar[0].length;
        int allEle = r*c;
        int cs = 0;
        int rs = 0;
        int ce = c-1;
        int re = r-1;

        ArrayList<Integer> list = new ArrayList<>();

        while (list.size() != allEle) {

            for (int i = cs; i <= ce; i++)
                list.add(ar[rs][i]);

            rs++;

            for (int i = rs; i <= re; i++)
                list.add(ar[i][ce]);

            ce--;

            for (int i = ce; i >= cs ; i--)
                list.add(ar[re][i]);

            re--;

            for (int i = re; i >= rs ; i--)
                list.add(ar[i][cs]);

            cs++;
        }

        for (int t: list) {

            System.out.print(t+" ");
        }
    }
}
