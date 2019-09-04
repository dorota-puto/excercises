package puto.spoj;

import java.util.Scanner;

public class Trn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] multi = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int c = scanner.nextInt();
                multi[i][j] = c;
            }
        }
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                System.out.print(multi[j][i] + " ");
            }
            System.out.println();
        }

    }
}


