package Arrays;

public class AddTwoNumber {

    public static void main (String args []) {

        int a [] = {9,9,9,9,9,8,9,9,9,9,9,9,1};
        int b [] = {9,9,9,9};

        int newA [] = new int[a.length + 1];

        int carry = 0;
        int counter = 0;

        for (int i = 0; i < b.length; i++) {

            counter++;

            int sum = a[i] + b[i] + carry;

            if (sum > 9) {

                carry = sum / 10;
                newA[i] = sum % 10;
            }
            else {
                carry = 0;
                newA[i] = sum;
            }
        }

        if (carry > 0) {

           for(int i = counter ; i < a.length; i++) {

               int sum = a[i] + carry;

               if (sum > 9) {

                   carry = sum / 10;
                   newA[i] = sum % 10;
               }
               else {
                   carry = 0;
                   newA[i] = sum;
               }
           }

           if(carry != 0)
                newA[newA.length-1] = carry;
        }

        for (int t : newA) System.out.print(t+" ");
    }
}
