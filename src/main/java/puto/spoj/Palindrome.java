package puto.spoj;

public class Palindrome {
    public static boolean isPalindrome(String a) {

        char[] b = a.toCharArray();
        int n = b.length;
        for (int i = 0; i < n / 2; i++) {
            if (b[i] != b[n - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeRec(char[] b, int start, int end) {
        if (start >= end) {
            return true;
        }
        return b[start] == b[end] && isPalindromeRec(b, start + 1, end - 1);
    }


    public static void main(String[] args) {
        System.out.println("is marakuja a palindrom? " + isPalindrome("marakuja"));
        System.out.println("is owocowo a palindrom? " + isPalindrome("owocowo"));
        System.out.println("is ala a palindrom? " + isPalindrome("ala"));
        System.out.println("is a a palindrom? " + isPalindrome("a"));
        System.out.println("is ' ' palindrom? " + isPalindrome(""));

        String b = "kajak";
        char[] a = b.toCharArray();

        System.out.println("is kajak a palindrom? " + isPalindromeRec(a, 0, 4));

    }
}
