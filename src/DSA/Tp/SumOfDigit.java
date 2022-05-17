package Tp;

public class SumOfDigit {

    public static void main(String args []) {

        int n = 7645648;
        int ans = 0;

        while (n > 9) {

            int temp = n;

            while(temp > 0) {

                int rem = temp % 10;
                temp /= 10;
                ans += rem;
            }

            n = ans;
            ans = 0;

        }

        System.out.println(n);
    }
}
