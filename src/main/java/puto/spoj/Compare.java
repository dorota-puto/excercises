package puto.spoj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Compare {

    public static List<Integer> compare(List<Integer> first, List<Integer> second) {

        List<Integer> temp = new ArrayList<>();

        for (int item1 : first) {
            boolean found = false;
            for (int item2 : second) {
                if (item1 == item2) {
                    found = true;
                    break;
                }
            }
            if(!found)
                temp.add(item1);
        }
        return temp;
    }

    public static void main(String[] args) {
        List<Integer> first = new ArrayList<>(Arrays.asList(3, 8, 5, 7, 9));
        List<Integer> second = new ArrayList<>(Arrays.asList(5, 2, 1, 4, 8));

        System.out.println(compare(first, second).toString());
    }
}
