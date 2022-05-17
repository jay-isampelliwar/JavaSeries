package strings;

public class HardPalindrone {

    public static void main (String args []) {

        String A = "Race  Car";
        A = A.toLowerCase();
        int j = A.length() - 1;
        int i = 0;
        int f = 0;

        while(i <= j) {

            if(A.charAt(i) >= 'a' && A.charAt(i) <= 'z') {

                if(A.charAt(j) >= 'a' && A.charAt(j) <= 'z') {


                    if(A.charAt(i) == A.charAt(j)) {

                        f = 1;
                    }
                    else {

                        f = 0;
                        break;
                    }
                }
                else {

                    j--;
                    continue;
                }

            }
            else {

                i++;
                continue;
            }
            j--;
            i++;
        }

        System.out.println(f);

    }
}
