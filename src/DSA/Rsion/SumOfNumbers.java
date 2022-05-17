package Rsion;

public class SumOfNumbers {

    public static void main(String args []) {

        int N = 18;

        System.out.println(getSum(N));
    }

    public static int getSum(int n) {

        if(n == 1) return 1;

        return getSum(n-1) + n;
    }
}
