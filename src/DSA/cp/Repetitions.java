package cp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Repetitions {

    public static void main(String args []) throws  Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int max = 0;
        int count = 1;
        int j = 0;
        int i = 0;

        while (i < str.length()) {

            count = 0;

            while (str.charAt(i) == str.charAt(j)) {

                count++;
                j++;
                if (j == str.length()) {
                    j = j-1;
                    break;
                }
            }

            if (max < count) max = count;

            if (i+1 < j) i = j;
            else i++;

            j = i + 1;
            if (j >= str.length()) j = str.length()-1;
            if(i == j) {
                max++;
                break;
            }
        }

        System.out.println(max);
    }
}
