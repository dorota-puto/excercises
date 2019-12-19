package puto.spoj;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {

    public static void reverse(char[] a) {
        int n = a.length;
        char t;
        int i;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
    }

    public static void reverseRec(char[] a, int start, int end) {

        if (start < end) {
            char temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            reverseRec(a, start + 1, end - 1);
        }
    }

    public static void main(String[] args) {

        String line = "anakonda";
        char[] a = line.toCharArray();
        reverseRec(a, 0, 7);
        System.out.println(String.valueOf(a));

        String line2 = "kotek";
        char[] b = line2.toCharArray();
        reverseRec(b, 0, 4);
        System.out.println(String.valueOf(b));

        String line3 = "ko";
        char[] d = line3.toCharArray();
        reverseRec(d, 0, 1);
        System.out.println(String.valueOf(d));

        String line4 = "k";
        char[] e = line4.toCharArray();
        reverseRec(e, 0, 0);
        System.out.println(String.valueOf(e));
    }
}

