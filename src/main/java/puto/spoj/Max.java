package puto.spoj;

import java.util.Arrays;

public class Max {

    public static int max(int[] arrary) {

        int temp = arrary[0];
        for (int i = 1; i < arrary.length; i++) {
            if (arrary[i] > temp) {
                temp = arrary[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {

        int[] a = {3, 5, 2, 5, 7, 8, 0, -9};
        System.out.println(max(a));
    }
}
