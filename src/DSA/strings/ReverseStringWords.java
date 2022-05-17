package strings;

import java.util.Arrays;

public class ReverseStringWords {

    public static void main (String args []) {

        String S = "You.are.losing.your.personality";

        String ar [] = S.split("o");

        System.out.println(Arrays.toString(ar));

        for(int i = 0; i < ar.length; i++) {

            StringBuffer buffer = new StringBuffer(ar[i]);
            System.out.print(buffer.reverse());
            if (i < ar.length - 1)
                System.out.print(".");
        }
    }
}
