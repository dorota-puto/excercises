package puto.spoj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    private static List<Integer> selectionSort(List<Integer> toSort) {

        for (int i = 0; i < toSort.size(); i++) {
            int index = i;
            int min = toSort.get(i);
            for (int j = i+1; j < toSort.size(); j++) {
                if (min > toSort.get(j)) {
                    min = toSort.get(j);
                    index = j;
                }
            }
            int temp = toSort.get(i);
            toSort.set(i, min);
            toSort.set(index, temp);
        }
        return toSort;
    }

    public static void main(String[] args) {
        List<Integer> toSort = Arrays.asList(8, 7, 6,9, 4, 9, 3,47,43, 65,9, 5);

        List<Integer> sorted= selectionSort(toSort);


        for (int i = 0; i < sorted.size(); i++) {
            System.out.print(sorted.get(i) + " ");
        }
    }
}

