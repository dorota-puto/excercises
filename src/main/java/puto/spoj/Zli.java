package puto.spoj;

import java.util.*;

public class Zli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> counters = new TreeMap<>();
        int a = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < a; i++) {
            String line = scanner.nextLine();
            char[] letters = line.toCharArray();
            for (char letter : letters) {
                if (Character.isWhitespace(letter)){
                    continue;
                }
                if (counters.containsKey(letter)) {
                    counters.put(letter, counters.get(letter) + 1);
                } else {
                    counters.put(letter, 1);
                }
            }
        }
        for (Character letter: counters.keySet()){
            System.out.println(letter+" "+counters.get(letter));
        }
    }
}