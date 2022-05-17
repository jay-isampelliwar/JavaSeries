package strings;

public class ReplaceByX {

    public static void main (String[] args) {

            String S1 = "geeksforge";
            String S2 = "geeks";
            String ans = "";
            boolean f = false;
            int n1 = S1.length();
            int n2 = S2.length();
            int i = 0;
            int j = n2-1;

            while(j < n1) {

                String ss = S1.substring(i , j+1);


                if(ss.equals(S2)) {

                    f = true;

                    if(j == n1-1) ans += "X";

                    i += n2;
                    j += n2;
                }
                else {


                    if(f) {

                        ans += 'X';
                        f = false;
                    }

                    ans += S1.charAt(i);

                    i++;
                    j++;


                }
            }

            ans += S1.substring(i);

            System.out.println(ans);

        }
    }
