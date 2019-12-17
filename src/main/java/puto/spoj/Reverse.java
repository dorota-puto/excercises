package puto.spoj;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {

    public static char[] reverse(char[] a, int n) {
        char t;
        int i;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            char[] a = line.toCharArray();

            System.out.println(String.valueOf(reverse(a,a.length)));
        }
    }
}
