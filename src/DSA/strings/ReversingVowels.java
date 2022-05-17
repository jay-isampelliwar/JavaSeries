package strings;

public class ReversingVowels {

        static boolean vowels(char ch) {

            return ( ch == 'a' || ch == 'A' ||
                    ch == 'e' || ch == 'E' ||
                    ch == 'i' || ch == 'I' ||
                    ch == 'o' || ch == 'O' ||
                    ch == 'u' || ch == 'U' );
        }

        public static void main(String[] args) {

            String str = "Kopoar";

            int j = str.length() - 1;
            int i = 0;
            char chA [] = str.toCharArray();

            while(i < j) {

                if(!vowels(str.charAt(i))) {

                    i++;
                    continue;
                }
                if(!vowels(str.charAt(j))) {

                    j--;
                    continue;
                }


                char temp = chA[i];
                chA[i] = chA[j];
                chA[j] = temp;

                i++;
                j--;
            }

            System.out.println(String.valueOf(chA));
        }
}
