package puto.spoj;


import org.apache.commons.lang3.tuple.Pair;

import java.util.*;

public class Pairs {

    public static Map<Pair, Integer> getPairs(List<Integer> list, int sum) {
        Map<Integer, Integer> newMap = new HashMap<>();
        for (int item : list) {
            if (!newMap.containsKey(item)) {
                newMap.put(item, 1);
            } else {
                newMap.replace(item, newMap.get(item) + 1);
            }
        }

        Map<Pair, Integer> result = new HashMap<>();
        int value;
        for (int item : newMap.keySet()) {
            value = sum - item;
            if (newMap.containsKey(value)) {
                int left;
                int right;
                if (item < value) {
                    left = item;
                    right = value;
                } else {
                    left = value;
                    right = item;
                }
                Pair<Integer, Integer> pair = Pair.of(left, right);

                if (newMap.get(value) >= 1) {
                    int amount = newMap.get(value) * newMap.get(item);
                    result.put(pair, amount);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 3, 5, 5, 5, -5, 13, 0, 6, 6, 4, 7, 8, 2, 9));
        System.out.println(getPairs(list, 8).toString());
    }
}
