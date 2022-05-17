package Rsion;

public class sumOfDigits {

    public static void main(String [] args) {

        int num = 36639;
        System.out.println(getSum(num));
    }

    public static int getSum(int n) {

        if(n < 10) return n;

        int sum = n % 10 + getSum(n/10);

        return sum;
    }
}
