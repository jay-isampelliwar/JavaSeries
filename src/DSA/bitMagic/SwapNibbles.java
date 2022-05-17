package bitMagic;

public class SwapNibbles {

    public static void main (String args []) {

        int n = 100;

        String s = Integer.toBinaryString(n);

        int l = s.length();

        if(l < 8) {

            String temp = "";

            for (int i = 1; i <= 8-l; i++) {
                temp += "0";
            }

            s = temp + s;
        }

        l = s.length();

        String f = s.substring(0 , l/2);
        String ll = s.substring(l/2);

        System.out.println(f+"     "+ll);

        s = "";

        s = s.concat(ll) + s.concat(f);

        System.out.println(s);

        int r = Integer.parseInt(s , 2);

        System.out.println(r);
    }
}
