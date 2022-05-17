package Tp;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Calcu {

    public static void main (String args []) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("**************************************************************************");
        System.out.println("\t\t WELCOME TO MY CALCULATOR");
        System.out.println("**************************************************************************");

        int operation;
        long a;
        long b;

        System.out.print("\tENTER FIRST NUMBER : ");
        a = scanner.nextLong();
        System.out.print("\tENTER SECOND NUMBER : ");
        b = scanner.nextLong();

        System.out.println("**************************************************************************");

        System.out.println("\t\tSELECT YOUR CHOICE ");
        System.out.println("\t ENTER -> 1 FOR ADDITION");
        System.out.println("\t ENTER -> 2 FOR SUBTRACTION");
        System.out.println("\t ENTER -> 3 FOR MULTIPLICATION");
        System.out.println("\t ENTER -> 4 FOR DIVISION");

        boolean operationNotDone = true;

        while (operationNotDone) {

            System.out.print( "\t ENTER YOUR CHOICE : ");

            operation = scanner.nextInt();

            switch (operation) {


                case 1:
                    System.out.print(a + b);
                    operationNotDone = false;
                    break;

                case 2:
                    System.out.print(a - b);
                    operationNotDone = false;
                    break;

                case 3:
                    System.out.print(a * b);
                    operationNotDone = false;
                    break;

                case 4:
                    System.out.print(a / b);
                    operationNotDone = false;
                    break;

                default:
                    System.out.println("\t\tINVALID CHOICE TRY AGAIN");
                    break;
            }
        }



    }
}
