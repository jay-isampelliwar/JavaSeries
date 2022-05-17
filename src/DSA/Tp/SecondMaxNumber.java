package Tp;

public class SecondMaxNumber {

    public static void main(String args[]) {

        int ar[] = {6, 5, 15, 4, 72, 3, 17, 266};

        int max = 0;
        int secondMax = 0;
        int thirdMax = 0;

        for(int i = 0; i < ar.length; i++) {

            if(max < ar[i]) {

                if(i == ar.length-1) thirdMax = secondMax;

                secondMax = max;
                max = ar[i];


            }
            else {

                if (ar[i] > secondMax) {

                    thirdMax = secondMax;
                    secondMax = ar[i];
                }
                else {

                    if(ar[i] > thirdMax) thirdMax = ar[i];
                }
            }
        }

        System.out.println(max);
        System.out.println(secondMax);
        System.out.println(thirdMax);
    }
}
