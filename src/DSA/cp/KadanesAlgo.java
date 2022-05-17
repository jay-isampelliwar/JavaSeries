package cp;

public class KadanesAlgo {

    public static void main(String args []) {

//        int ar[] = { -1 ,-3 , 5, -6, 1, 3, -1, 4,-1, 4, 1};
        int ar[] = {5,-4,-2,9,-1};

        int sum = 0;
        int max = 0;

        for(int i = 0; i < ar.length; i++) {

            sum = sum +  ar[i];

            if(sum > max) {
                max = sum;
            }

            if(sum < 0) {
                sum = 0;
            }
        }

        System.out.println(sum);
    }
}
