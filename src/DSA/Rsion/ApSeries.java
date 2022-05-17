package Rsion;

public class ApSeries {

    public static void main(String args []) {

        int f = 5;
        int d = 4;
        int n = 12;

        for (int i = 1; i <= n; i++) {
            System.out.print(getSeries(f , d , i)+" ");
        }

    }

    public static int getSeries(int f, int d , int n) {

        if(n == 1) return f;

        return getSeries(f , d , n - 1) + d;
    }
}
