package bitMagic;

public class AddingTwoNumbers {

    public static void main(String args []) {

        int a = 7;
        int b = 3;

        System.out.println(sum(a,b));
    }

    static int sum(int a , int b) {

        int temp = 0;

        while (b != 0) {

            temp = a & b;
            a = a ^ b;
            b = temp << 1;
        }
        return a;
    }
}
