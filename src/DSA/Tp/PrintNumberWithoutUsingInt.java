package Tp;

public class PrintNumberWithoutUsingInt {

    public static void main(String args []) {

        char a = 'A';
        String b = "**********";

        for(int A = a - 'A'; A <= b.length()*b.length(); A++ ) System.out.println(A);
    }
}
