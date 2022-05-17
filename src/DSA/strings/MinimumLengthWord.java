package strings;

import java.util.Scanner;

public class MinimumLengthWord {

    public static void main(String args []) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String ans = "";

        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;

        for(; i < s.length(); i++) {

            if(s.charAt(i) == ' '){

                if(min > (i+1)-(j+1)) {

                    ans = s.substring(j , i);
                    min = (i+1)-(j+1);
                }

                j = i + 1;
            }
        }

        if(min > (i+1)-(j+1))
            ans = s.substring(j , i);


        System.out.println(ans);
    }
}
