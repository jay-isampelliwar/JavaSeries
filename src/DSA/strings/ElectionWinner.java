package strings;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ElectionWinner {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {

            int n = sc.nextInt();
            String s[] = new String[n];

            for(int i = 0; i < n; i++) s[i] = sc.next();


            HashMap<String , Integer> hm = new HashMap();

            for(int j = 0; j < n; j++) {

                if(hm.containsKey(s[j])){

                    int get = hm.get(s[j]);

                    hm.put(s[j] , get+1);
                }
                else {

                    hm.put(s[j] , 1);
                }
            }

            String ans = "h";
            int max = 0;
            for(Map.Entry<String , Integer> itr : hm.entrySet()) {


                if(max < itr.getValue()) {

                    max = itr.getValue();
                    ans = itr.getKey();
                    continue;
                }

                if(max == itr.getValue()){

                    int c = itr.getKey().compareTo(ans);

                    if(c < 0) {

                        ans = itr.getKey();
                    }
                }
            }

            System.out.println(ans);
        }
    }
}
