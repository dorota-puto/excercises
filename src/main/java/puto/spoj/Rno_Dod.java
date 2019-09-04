package puto.spoj;

import java.util.Scanner;

public class Rno_Dod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tline = scanner.nextLine();
        int t = Integer.parseInt(tline);
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            String numberLine = scanner.nextLine();
            String[] numberStrings = numberLine.split(" ");
            int result = 0;
            for (int j = 0; j < n; j++) {
                int x = Integer.parseInt(numberStrings[j]);
                result = result + x;
            }
            System.out.println("" + result);
        }
    }

}
