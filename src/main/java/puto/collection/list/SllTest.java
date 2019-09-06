package puto.collection.list;

import puto.collection.filters.IFilter;
import puto.collection.filters.MinimumLengthFilter;

public class SllTest {
    public static void main(String[] args) {
        SimpleLinkedList<String> simpleLinkedList = new SimpleLinkedList<>();
        System.out.println("size = " + simpleLinkedList.size());
        simpleLinkedList.add("kotek"); // 0
        simpleLinkedList.add("piesek"); // 0
        simpleLinkedList.add("rr"); // 0
        simpleLinkedList.add("jeżyk"); // 0
        simpleLinkedList.add("muszka"); // 0
        simpleLinkedList.add("krecik"); // 0
        simpleLinkedList.add("t"); // 0

        System.out.println(simpleLinkedList);

        SimpleLinkedList filteredList = simpleLinkedList.filterList(new MinimumLengthFilter(3));
        System.out.println(filteredList);

        SimpleLinkedList listFilteredByPLetter = simpleLinkedList.filterList(new IFilter<String>() {
            @Override
            public boolean isIncluded(String value) {
                return value.startsWith("p");
            }
        });
        System.out.println(listFilteredByPLetter);

        //   System.out.println(simpleLinkedList.get(0));
        //   System.out.println(simpleLinkedList.get(1));
        //   System.out.println(simpleLinkedList.get(2));
        //   System.out.println(simpleLinkedList.get(3));
        //  System.out.println(simpleLinkedList.get(4));
        // System.out.println("list has at index "+index+" element equal to '"+simpleLinkedList.get(2)+"' bla bla bla");
        // System.out.println(String.format("list has at index %10.2f element equal to '%10s' bla bla bla", (float)index, simpleLinkedList.get(2)));
        //System.out.println(simpleLinkedList.get(10));
    }
}
