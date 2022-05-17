package DSA.Tp;

public class DiffrenceSumProduct {

    public static void main(String[] args) {

        int n = 243;
        int sum = 0;
        int prod = 1;

        while (n > 0) {

            int rem = n % 10;
            n /= 10;
            sum += rem;
            prod *= rem;
        }

        System.out.println(prod-sum);
    }
}
