package strings;

public class LongestPrefixString {

    public static void main(String[] args) {

        String arr[] =  {"a","b","c","ab","bc","abc"};
        String s = "abc";
        int n = arr.length;

        System.out.println(getPrefix(arr , n));

        System.out.println(numberPrefix(arr ,s , n));

    }

    private static int numberPrefix(String[] arr, String s, int n) {

        int count = 0;

        for(String str : arr) {

            if(s.indexOf(str) == 0) {

                count++;
            }
        }

        return  count;
    }

    public static String getPrefix(String arr[] , int n) {

        String prefix = arr[0];

        for (String S : arr) {

            while (S.indexOf(prefix) != 0) {

                prefix = prefix.substring(0, prefix.length()-1);
            }
        }

        if(prefix.isEmpty()) return "-1";
        else return prefix;
    }

}
