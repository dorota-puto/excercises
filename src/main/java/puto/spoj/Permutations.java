package puto.spoj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public static void permutations(String prefix, String basic) {
        if (basic.length() <= 1) {
            System.out.println(prefix + basic);
            return;
        }

        for (int index = 0; index < basic.length(); index++) {
            String newPrefix = prefix + basic.charAt(index);
            String without = basic.substring(0, index) + basic.substring(index + 1);
            permutations(newPrefix, without);
        }
    }

    public static List<String> permutationsSecondApproach(String basic) {
        if (basic.length() <= 1) {
            return Arrays.asList(basic);
        }

        List<String> result = new ArrayList<>();
        for (int index = 0; index < basic.length(); index++) {
            String prefix = ""+basic.charAt(index);
            String without = basic.substring(0, index) + basic.substring(index + 1);

            for(String p : permutationsSecondApproach(without)){
                result.add(prefix+p);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        permutations("", "abcd");
       // permutationsSecondApproach("abcd").forEach(System.out::println);
    }

}
