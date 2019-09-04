package puto.collection.list;

public class SllTest {
    public static void main(String[] args) {
        SimpleLinkedList simpleLinkedList = new SimpleLinkedList();
        System.out.println("size = " + simpleLinkedList.size());
        simpleLinkedList.add("ala"); // 0
        System.out.println("size = " + simpleLinkedList.size());
       // simpleLinkedList.add("ola"); // 1
       // System.out.println("size = " + simpleLinkedList.size());
       // simpleLinkedList.add("ela"); // 2
      //  simpleLinkedList.add("bartek"); // 3
      //  System.out.println("size = " + simpleLinkedList.size());
      //  simpleLinkedList.add("ula"); // 4
      //  System.out.println("size = " + simpleLinkedList.size());


       simpleLinkedList.remove(0);
        System.out.println("size = " + simpleLinkedList.size());

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
