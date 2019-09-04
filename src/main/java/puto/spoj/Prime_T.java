package puto.spoj;

import java.util.Scanner;

public class Prime_T {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tline = scanner.nextLine();
        int t = Integer.parseInt(tline);
        for (int i = 0; i < t; i++) {
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println(checkIfPrime(a));
        }
    }

    private static String checkIfPrime(int a) {
        if (a == 1) {
            return "NIE";
        }
        for (int j = 2; j < a; j++) {
            if (a % j == 0) {
                return "NIE";
            }
        }
        return "TAK";
    }
}
