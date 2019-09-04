package puto.spoj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Trn2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        List<List<Integer>> multi = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            multi.add(row);
            for (int j = 0; j < n; j++) {
                int c = scanner.nextInt();
                row.add(c);
            }
        }
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                System.out.print(multi.get(j).get(i) + " ");
            }
            System.out.println();
        }

    }
}

