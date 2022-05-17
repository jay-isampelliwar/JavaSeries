package Rsion;

public class PalindromeString {

    public static void main(String args []) {

        String S = "jjjjjjjjjj";
        int i = 0;
        int j = S.length()-1;

        if(isPalindrome(S , i , j)) {

            System.out.println("IS PALINDROME");
        }
        else {

            System.out.println("IT IS NOT PALINDROME");
        }
    }

    public static boolean isPalindrome(String S , int i ,int  j) {

        if(i >= j) return true;

        if (S.charAt(i) != S.charAt(j)) return false;

        return isPalindrome(S , i + 1, j - 1);

    }
}
