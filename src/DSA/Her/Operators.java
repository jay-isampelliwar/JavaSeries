package Her;

import java.sql.SQLOutput;

public class Operators {

    public static void main (String args []) {

        int a = 32;
        int b = 14;

        System.out.println("Arithmetic Operator ");
        System.out.println("Addition : "+ (a + b));
        System.out.println("Subtraction : "+ (a - b));
        System.out.println("Multiplication : "+ (a * b));
        System.out.println("Division : "+ (a / b));
        System.out.println("Modulo : "+ (a % b));

        System.out.println("Bitwise Operators");
        System.out.println("AND : "+ (a & b));
        System.out.println("OR : "+ (a | b));

        System.out.println("Unary Operators");
        System.out.println("Unary Increment : "+(++a));
        System.out.println(("Unary Decrement : "+ (--a)));
        System.out.println("Logical Not : "+ (!true));

//        Assignment Operator

        int ans = 0;

        ans += a;
        ans -= a;
        ans *= a;
        ans /= a;
        ans %= a;

//        Ternary Operator

        boolean temp = a > b ? true : false;

        System.out.println("Relational Operators");
        System.out.println("Greater than : "+ (a > b));
        System.out.println("Less than : "+ (a < b));
        System.out.println("Greater than equal to : "+ (a >= b));
        System.out.println("Less than equal to : "+ (a <= b));
        System.out.println("Equal to : "+ (a == b));
        System.out.println("Not Equal to : "+ (a != b));

        System.out.println("Bitwise Shift Operator");
        System.out.println("BitWise Right Shift : "+ (a >> 1));
        System.out.println("BitWise Right Shift : "+ (a << 2));

//        Logical Operator

        if (a > b && a > 0) {

            System.out.println("Logical AND");
        }

        if (a > b || a > 0) {

            System.out.println("Logical OR");
        }
    }
}
