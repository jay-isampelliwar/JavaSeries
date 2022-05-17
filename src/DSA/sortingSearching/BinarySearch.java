package sortingSearching;

public class BinarySearch {

    public static void main(String args []) {

        int a[] = {1,3,5,11,45,78,227,257,893,2345, 111145, 74444474};
        int key = 227;
        int l = 0;
        int h = a.length - 1;

        if(binarySearch(a , key , l ,h)) System.out.println("Number is present");
        else System.out.println("Number is not present");

    }

    public static boolean binarySearch(int a[], int key , int l , int h) {

        while (l <= h) {

            int mid = (l + h) / 2;

            if(a[mid] == key) {

                return true;
            }
            else if (a[mid] > key) {

                h = mid - 1;
            }
            else {

                l = mid + 1;
            }
        }

        return false;
    }
}
