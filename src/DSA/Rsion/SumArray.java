package Rsion;

public class SumArray {

    public static void main(String args []) {

        int a [] = {5,6,12,11,1,35,22,6,7,15,16};

        int n = a.length-1;

        System.out.println(getSum(a,n));
        System.out.println(evenSum(a,n));
        System.out.println(oddSum(a,n));
        System.out.println(evenIndexSum(a,n));
        System.out.println(oddIndexSum(a,n));
    }

    static int getSum(int [] a , int n) {

        if( n == 0) return  a[n];
        return getSum(a , n - 1) + a[n];
    }

    static int evenSum(int[] arr ,int n) {

        if(n == -1) return 0;

        if(arr[n] % 2 != 0) return evenSum(arr , n-1);

        return arr[n] + evenSum(arr , n-1);

    }

    static int oddSum(int[] arr ,int n) {

        if(n == -1) return 0;

        if(arr[n] % 2 == 0) return oddSum(arr , n-1);

        return arr[n] + oddSum(arr , n-1);

    }

    static int evenIndexSum(int[] arr ,int n) {

        if(n == 0) return arr[n];

        if(n % 2 != 0) return evenIndexSum(arr ,n-1);

        return arr[n] + evenIndexSum(arr , n-1);

    }


    static int oddIndexSum(int[] arr ,int n) {

        if(n == 1) return arr[n];

        if(n % 2 == 0) return oddIndexSum(arr , n-1);

        return arr[n] + oddIndexSum(arr , n-1);

    }
}
