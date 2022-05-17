package cp;

public class MajorityElementNxN {

    public static void main (String args []) {

        int[] ar = { 1, 8, 7, 4, 1, 2, 2, 2, 2, 2, 2 };
        int majoEle = 0;
        int count = 0;

        for (int i = 0; i < ar.length; i++) {

            for (int j = i + 1; j < ar.length; j++) {

                if (ar[i] == ar[j]) count++;
            }

            if (count > (ar.length / 2)) {

                majoEle = ar[i];
                break;
            }
        }
        System.out.println(majoEle);
    }
}
