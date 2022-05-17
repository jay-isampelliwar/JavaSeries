package cp;
public class MajorityElementON{

    public static void main(String args []) {

        int ar[] =  { 1, 8, 7, 4, 1, 2, 2, 2, 2 , 2 , 2 };
        int l = 0;
        int majoEle = 0;

        for(int i = 0; i < ar.length; i++) {

            if (l == 0) {

                majoEle = ar[i];
                l = 1;
            }
            else {

                if (majoEle == ar[i]) l++;
                else l--;
            }
        }

        int finalCount = 0;
        for (int i = 0; i < ar.length; i++) {

            if (majoEle == ar[i])  finalCount++;


        }

        if (finalCount > (ar.length / 2)) System.out.print(majoEle+" is the Majority Element");
        else System.out.print("Majority Element is not present");
    }
}

