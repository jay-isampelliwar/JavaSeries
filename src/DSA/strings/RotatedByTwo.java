package strings;

public class RotatedByTwo {

    public static void main(String args []) {

        String a = "a";
        String b = "a";


        if (a.length() != b.length()) System.out.println("N");

        if (a.length() == 1) {

            if (a.equals(b)) System.out.println("Y");
            else System.out.println("N");

            return;
        }

        if (a.substring(0 , 2).equals(b.substring(b.length()-2 , b.length()))) System.out.println("Y");
        else if (b.substring(0 , 2).equals(a.substring(a.length()-2 , a.length()))) System.out.println("Y");
        else System.out.println("N");

    }
}
