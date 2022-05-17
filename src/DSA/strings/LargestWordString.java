package strings;

public class LargestWordString {

    public static void main(String args []) {

        String S = "look write can  j kjkh hkjhk kjui kjh hlk oj jkhk   g ";

        int maxLen = 0;
        int len = 0;
        int n = S.length();
        int i = 0;

        while(i < n){

            if(S.charAt(i) == ' ') {

                if(len > maxLen){

                    maxLen = len;

                }
                len = 0;
            }
            else {
                    len++;
            }
            i++;
//            if(len > maxLen){
//
//                maxLen = len;
//                len = 0;
//            }
        }

        System.out.println(maxLen);
    }
}
