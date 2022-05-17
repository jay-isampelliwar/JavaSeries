package Leetcode;

public class ReverseNumber {

    static public int reverse(int n) {

        int rev = 0;
        while (n != 0) {

            int rem = n % 10;
            rev = (rev*10) + rem;
            n /= 10;
        }

        return rev;
    }

    public static void main(String aegs []) {

        int n = -120;

        System.out.println(reverse(n));
    }
}
