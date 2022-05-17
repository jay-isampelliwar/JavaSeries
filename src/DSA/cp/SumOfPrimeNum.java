package cp;

public class SumOfPrimeNum {

    public static void main(String  args []) {

        boolean f = true;
        int n = 31;

        for(int i = 2; i <= n/2; i++){

                if (n % i == 0)
                {
                    f = false;
                    break;
                }
        }

        if (f) System.out.println("Prime");
        else System.out.println("Not Prime");

    }
}
