package Her;

public class PrimeNumber {

    public static void main (String  args []) {

        int n = 23;
        boolean isBoolean = true;

        for(int i = 2; i <= n/2; i++) {

            if(n % i == 0) {

                isBoolean = false;
                break;
            }
        }

        if (isBoolean)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }
}
