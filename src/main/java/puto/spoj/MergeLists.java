package puto.spoj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeLists {
    private static List<Integer> mergeList(List<Integer> first, List<Integer> second) {

        List<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < first.size() & j < second.size()) {
            if (first.get(i) >= second.get(j)) {
                result.add(second.get(j));
                j++;
            } else {
                result.add(first.get(i));
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> first = Arrays.asList(1, 4, 6, 7, 9);
        List<Integer> second = Arrays.asList(1, 2, 8);

        for (int i = 0; i < mergeList(first, second).size(); i++) {
            System.out.print(mergeList(first, second).get(i) + " ");
        }
    }

}

