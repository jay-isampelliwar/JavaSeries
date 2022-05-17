package Arrays;

public class CeilValue {

    public static void main(String[] args) {

        int ar[] = {1 , 4, 5, 10, 13, 17, 21, 28};
        int target = 14;

        int left = 0;
        int right = ar.length -1;

        while(left <= right) {

            int mid = (right + left) / 2;

            if(ar[mid] == target) {
                System.out.println(ar[mid]);
                return;
            }
            else if(ar[mid] > target) {

                right = mid - 1;
            }
            else {

                left = mid + 1;
            }
        }

        System.out.println(ar[right]);
        System.out.println(ar[left]);

    }
}
