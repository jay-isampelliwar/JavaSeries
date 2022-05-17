package Her;

public class EvenOdd {

    public static void main (String args []) {

        System.out.print("Even Numbers : ");
        for(int i = 1; i <= 20; i++) {

            if( i % 2 == 0)
                System.out.print(i+" ");

        }

        System.out.print("\nOdd Numbers : ");
        for(int i = 1; i <= 20; i++) {

            if( i % 2 != 0)
                System.out.print(i+" ");

        }
    }
}
