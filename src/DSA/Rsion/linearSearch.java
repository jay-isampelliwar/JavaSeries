package Rsion;

public class linearSearch {

    public static void main(String[] args) {

        int [] arr = {1,4,45,21,18,33,17,9};
        int n = arr.length;

        System.out.println(search(arr , n , 21));
    }

    public static  boolean search(int [] arr , int n , int  target) {

        if (n == 0) return false;
        if(arr[n-1] == target) return true;

        return search(arr , n-1, target);
    }
}
