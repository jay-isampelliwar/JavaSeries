package Rsion;

public class Factorial {

    public static void  main(String args []) {

        long N = 20;

        System.out.println(getFact(N));

    }
    public static long getFact(long n) {

        if(n == 0 || n == 1) return 1;

        return n * getFact(n-1);
    }
}
