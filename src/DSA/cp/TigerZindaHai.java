package cp;

import java.util.HashSet;

public class TigerZindaHai {

    public static void main(String args[]) {

        HashSet<String> h = new HashSet<>();
        String ar [] = {"5", "8" ,"9", "6", "END" ,"4", "END" ,"9", "2" , "END" ,"7" , "9"};

        for(String a: ar) {

            if(a == "END") {

                h.clear();

            }
            else if(!h.contains(a)) {

                h.add(a);

            }
            else {

                h.remove(a);
            }
        }

        System.out.println(h.size());
    }
}
