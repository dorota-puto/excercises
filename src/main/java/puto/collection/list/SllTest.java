package puto.collection.list;

public class SllTest {
    public static void main(String[] args) {
        SimpleLinkedList simpleLinkedList = new SimpleLinkedList();
        System.out.println("size = " + simpleLinkedList.size());
        simpleLinkedList.add("kotek"); // 0
        simpleLinkedList.add("piesek"); // 0
        simpleLinkedList.add("jeżyk"); // 0
        simpleLinkedList.add("muszka"); // 0
        simpleLinkedList.add("krecik"); // 0

System.out.println(simpleLinkedList);

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
